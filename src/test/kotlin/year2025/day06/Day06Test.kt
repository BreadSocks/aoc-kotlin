package year2025.day06

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day06Test {

    val dayWithExamples = Day06("year2025/day06/example")
    val dayWithInput = Day06("year2025/day06/input")

    @Test
    fun part1Example() {
        Assertions.assertEquals(4277556, dayWithExamples.part1())
    }

    @Test
    fun part2Example() {
        Assertions.assertEquals(3263827, dayWithExamples.part2())
    }

    @Test
    fun part1() {
        Assertions.assertEquals(4387670995909, dayWithInput.part1())
    }

    @Test
    fun part2() {
        Assertions.assertEquals(9625320374409, dayWithInput.part2())
    }
}