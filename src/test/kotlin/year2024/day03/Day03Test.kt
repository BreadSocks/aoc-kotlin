package year2024.day03

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import year2024.day03.Day03

class Day03Test {

    val dayWithExamples = Day03(
        filePath = "year2024/day03/",
        part1File = "year2024/day03/example",
        part2File = "year2024/day03/example2",
    )
    val dayWithInput = Day03()

    @Test
    fun part1Example() {
        Assertions.assertEquals(161, dayWithExamples.part1())
    }

    @Test
    fun part2Example() {
        Assertions.assertEquals(48, dayWithExamples.part2())
    }

    @Test
    fun part1() {
        Assertions.assertEquals(174960292, dayWithInput.part1())
    }

    @Test
    fun part2() {
        Assertions.assertEquals(56275602, dayWithInput.part2())
    }
}