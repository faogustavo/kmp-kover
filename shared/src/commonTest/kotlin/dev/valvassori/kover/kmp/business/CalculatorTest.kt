package dev.valvassori.kover.kmp.business

import dev.valvassori.kover.kmp.busines.Calculator
import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {

    private val subject = Calculator()

    @Test
    fun sumTwoNumbers_shouldReturnExpectedValue() {
        val testCases = listOf(
            TestCase(1, 1, 2),
            TestCase(3, 5, 8),
            TestCase(5, 5, 10),
            TestCase(98, 3, 101),
            TestCase(3, 7, 10),
            TestCase(12, 16, 28),
        )

        testCases.forEach { (a, b, expectedResult) ->
            val result = subject.sum(a, b)
            assertEquals(
                expectedResult,
                result,
                "($a + $b) should be $expectedResult"
            )
        }
    }

    @Test
    fun subtractTwoNumbers_shouldReturnExpectedValue() {
        val testCases = listOf(
            TestCase(1, 1, 0),
            TestCase(3, 5, -2),
            TestCase(15, 5, 10),
            TestCase(98, 3, 95),
            TestCase(3, 7, -4),
            TestCase(16, 12, 4),
        )

        testCases.forEach { (a, b, expectedResult) ->
            val result = subject.sub(a, b)
            assertEquals(
                expectedResult,
                result,
                "($a - $b) should be $expectedResult"
            )
        }
    }

    private data class TestCase(
        val a: Int,
        val b: Int,
        val result: Int,
    )
}
