package year2025.day04

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day04Test {

    val dayWithExamples = Day04("year2025/day04/example")
    val dayWithInput = Day04("year2025/day04/input")

    @Test
    fun part1Example() {
        Assertions.assertEquals(13, dayWithExamples.part1())
    }

    @Test
    fun part2Example() {
        Assertions.assertEquals(43, dayWithExamples.part2())
    }

    @Test
    fun part1() {
        Assertions.assertEquals(1372, dayWithInput.part1())
    }

    @Test
    fun part2() {
        Assertions.assertEquals(7922, dayWithInput.part2())
    }
}