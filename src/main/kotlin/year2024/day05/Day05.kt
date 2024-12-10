package year2024.day05

import readInputAsString

class Day05(filePath: String) {

    private val rules: List<Pair<Int, Int>>
    private val updates: List<List<Int>>

    init {
        val (part1, part2) = readInputAsString(filePath).split("\n\n")
        rules = part1.split("\n")
            .map { line ->
                line.split("|").let { it[0].toInt() to it[1].toInt() }
            }
        updates = part2.split("\n")
            .map { it.split(",").map { it.toInt() } }
        println(rules)
        println(updates)
    }

    private val valid = updates.filter { update ->
        rules.filter {
            it.first in update && it.second in update
        }.all {
            update.indexOf(it.first) < update.indexOf(it.second)
        }
    }

    fun part1(): Int {
        return valid.sumOf { it[((it.count() / 2))] }
    }

    fun part2(): Int {
        val invalids = updates.toMutableList().apply { removeAll(valid) }.toList()
        invalids.count { invalid ->
            val validRules = rules.filter {
                it.first in invalid && it.second in invalid
            }.toMutableList()

            while (validRules.isNotEmpty()) {

            }

            true
        }
        return 0
    }
}

fun main() {
    val day = Day05("year2024/day05/example")
    println(day.part1())
    println(day.part2())
}
