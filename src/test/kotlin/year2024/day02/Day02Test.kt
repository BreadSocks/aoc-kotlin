package year2024.day02

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import year2024.day02.Day02

class Day02Test {

    val dayWithExamples = Day02("year2024/day02/example")
    val dayWithInput = Day02("year2024/day02/input")

    @Test
    fun part1Example() {
        Assertions.assertEquals(2, dayWithExamples.part1())
    }

    @Test
    fun part2Example() {
        Assertions.assertEquals(4, dayWithExamples.part2())
    }

    @Test
    fun part1() {
        Assertions.assertEquals(479, dayWithInput.part1())
    }

    @Test
    fun part2() {
        Assertions.assertEquals(531, dayWithInput.part2())
    }
}