package year2025.day02

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day02Test {

    val dayWithExamples = Day02("year2025/day02/example")
    val dayWithInput = Day02("year2025/day02/input")

    @Test
    fun part1Example() {
        Assertions.assertEquals(1227775554, dayWithExamples.part1())
    }

    @Test
    fun part2Example() {
        Assertions.assertEquals(4174379265, dayWithExamples.part2())
    }

    @Test
    fun part1() {
        Assertions.assertEquals(18595663903, dayWithInput.part1())
    }

    @Test
    fun part2() {
        Assertions.assertEquals(19058204438, dayWithInput.part2())
    }
}