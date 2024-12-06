package year2024.day02

import readInput
import kotlin.contracts.contract
import kotlin.math.abs
import kotlin.math.sign

class Day02(filePath: String) {

    private val reports = readInput(filePath)
        .map { line ->
            line.split(" ").map { it.toInt() }
        }

    fun part1(): Int {
        return reports.count { isValid(it) }
    }

    fun part2(): Int {
        return reports.count { report ->
            val permutations = report.indices.map { index ->
                report.toMutableList().apply { removeAt(index) }.toList()
            }.toMutableList().apply { add(report) }

            permutations.any { isValid(it) }
        }
    }

    private fun isValid(levels: List<Int>): Boolean {
        var lastDiff = 0
        for ((index, x) in levels.withIndex()) {
            if (index == levels.count() - 1) {
                return true // success if we get to this index without breaking out
            } else {
                val currentDiff = x - levels[index + 1]
                if (x == levels[index + 1]) { // numbers are the same
                    return false
                } else if (abs(currentDiff) !in 1..3) { // jump too much
                    return false
                } else if (lastDiff != 0 && currentDiff.sign != lastDiff.sign) { // moved in different direction
                    return false
                } else {
                    lastDiff = currentDiff
                }
            }
        }
        return false
    }
}

fun main() {
    val day = Day02("year2024/day02/input")
    println(day.part1())
    println(day.part2())
}
