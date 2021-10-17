pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/jb-coverage/maven")
    }
}

rootProject.name = "KMPKover"
include(":androidApp")
include(":shared")
