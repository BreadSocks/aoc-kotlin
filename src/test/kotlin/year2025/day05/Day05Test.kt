package year2025.day05

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day05Test {

    val dayWithExamples = Day05("year2025/day05/example")
    val dayWithInput = Day05("year2025/day05/input")

    @Test
    fun part1Example() {
        Assertions.assertEquals(3, dayWithExamples.part1())
    }

    @Test
    fun part2Example() {
        Assertions.assertEquals(14, dayWithExamples.part2())
    }

    @Test
    fun part1() {
        Assertions.assertEquals(525, dayWithInput.part1())
    }

    @Test
    fun part2() {
        Assertions.assertEquals(333892124923577, dayWithInput.part2())
    }
}