buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30")
        classpath("com.android.tools.build:gradle:7.0.3")
    }
}

plugins {
    id("org.jetbrains.kotlinx.kover") version "0.4.2"
}

kover {
    isEnabled = true
    coverageEngine.set(kotlinx.kover.api.CoverageEngine.INTELLIJ)
    generateReportOnCheck.set(true)
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }

    afterEvaluate {
        tasks.withType(Test::class).configureEach {
            extensions.configure(kotlinx.kover.api.KoverTaskExtension::class) {
                isEnabled = true
                excludes = listOf(".*BuildConfig.*")
                binaryReportFile.set(file("$buildDir/kover/$name/report.bin"))
            }
        }

        tasks.withType(kotlinx.kover.tasks.KoverHtmlReportTask::class).configureEach {
            isEnabled = true
        }

        tasks.withType(kotlinx.kover.tasks.KoverXmlReportTask::class).configureEach {
            isEnabled = true
            xmlReportFile.set(file("$buildDir/kover/${name}/report.xml"))
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
