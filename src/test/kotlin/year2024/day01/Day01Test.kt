package year2024.day01

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day01Test {

    val dayWithExamples = Day01("year2024/day01/example")
    val dayWithInput = Day01("year2024/day01/input")

    @Test
    fun part1Example() {
        Assertions.assertEquals(dayWithExamples.part1(), 11)
    }

    @Test
    fun part2Example() {
        Assertions.assertEquals(dayWithExamples.part2(), 31)
    }

    @Test
    fun part1() {
        Assertions.assertEquals(dayWithInput.part1(), 2769675)
    }

    @Test
    fun part2() {
        Assertions.assertEquals(dayWithInput.part2(), 24643097)
    }
}