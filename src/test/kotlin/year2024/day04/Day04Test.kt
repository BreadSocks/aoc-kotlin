package year2024.day04

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day04Test {

    val dayWithExamples = Day04("year2024/day04/example")
    val dayWithInput = Day04("year2024/day04/input")

    @Test
    fun part1Example() {
        Assertions.assertEquals(18, dayWithExamples.part1())
    }

    @Test
    fun part2Example() {
        Assertions.assertEquals(9, dayWithExamples.part2())
    }

    @Test
    fun part1() {
        Assertions.assertEquals(2454, dayWithInput.part1())
    }

    @Test
    fun part2() {
        Assertions.assertEquals(1858, dayWithInput.part2())
    }
}