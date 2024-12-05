package year2024.day01

import readInput
import kotlin.math.abs

class Day01(filePath: String) {

    private val left: List<Int>
    private val right: List<Int>

    init {
        val (left, right) = readInput(filePath)
            .map {
                val blah = it.substringBefore(" ").toInt()
                val blah2 = it.substringAfterLast(" ").toInt()
                blah to blah2
            }.unzip()
        this.left = left.sorted()
        this.right = right.sorted()
    }

    fun part1(): Int {
        val distances = left.mapIndexed { index, x ->
            abs(x - right[index])
        }
        return distances.sum()
    }

    fun part2(): Int {
        val blah =  left.fold(0, { total, locationId ->
            total + right.count { it == locationId } * locationId
        })
        return blah
    }
}

fun main() {
    val day = Day01("year2024/day01/input")
    println(day.part1())
    println(day.part2())
}
