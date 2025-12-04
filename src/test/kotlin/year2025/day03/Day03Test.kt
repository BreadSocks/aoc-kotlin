package year2025.day03

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day03Test {

    val dayWithExamples = Day03("year2025/day03/example")
    val dayWithInput = Day03("year2025/day03/input")

    @Test
    fun part1Example() {
        Assertions.assertEquals(357, dayWithExamples.part1())
    }

    @Test
    fun part2Example() {
        Assertions.assertEquals(3121910778619, dayWithExamples.part2())
    }

    @Test
    fun part1() {
        Assertions.assertEquals(16993, dayWithInput.part1())
    }

    @Test
    fun part2() {
        Assertions.assertEquals(168617068915447, dayWithInput.part2())
    }
}