package year2024.day05

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day05Test {

    val dayWithExamples = Day05("year2024/day05/example")
    val dayWithInput = Day05("year2024/day05/input")

    @Test
    fun part1Example() {
        Assertions.assertEquals(143, dayWithExamples.part1())
    }

//    @Test
//    fun part2Example() {
//        Assertions.assertEquals(9, dayWithExamples.part2())
//    }

    @Test
    fun part1() {
        Assertions.assertEquals(5064, dayWithInput.part1())
    }

//    @Test
//    fun part2() {
//        Assertions.assertEquals(1858, dayWithInput.part2())
//    }
}