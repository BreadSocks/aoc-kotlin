package year2024.day01

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day01Test {

    val dayWithExamples = Day01("year2024/day01/example")
    val dayWithInput = Day01("year2024/day01/input")

    @Test
    fun part1Example() {
        Assertions.assertEquals(11, dayWithExamples.part1())
    }

    @Test
    fun part2Example() {
        Assertions.assertEquals(31, dayWithExamples.part2())
    }

    @Test
    fun part1() {
        Assertions.assertEquals(2769675, dayWithInput.part1())
    }

    @Test
    fun part2() {
        Assertions.assertEquals(24643097, dayWithInput.part2())
    }
}