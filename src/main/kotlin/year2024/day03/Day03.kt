package year2024.day03

import readInputAsString

class Day03(
    filePath: String = "year2024/day03/",
    val part1File: String = "${filePath}input",
    val part2File: String = "${filePath}input"
) {
    fun part1(): Int {
        val memory = readInputAsString(part1File)
        val regex = """mul\((\d+),(\d+)\)""".toRegex()
        val blah = regex.findAll(memory)
        return blah.sumOf {
            it.groupValues[1].toInt() * it.groupValues[2].toInt()
        }
    }

    fun part2(): Int {
        val memory = readInputAsString(part2File)
        val regex = """don't\(\)|do\(\)|mul\((\d+),(\d+)\)""".toRegex()
        val blah = regex.findAll(memory)
        var on = true
        return blah.sumOf {
            if (it.groupValues.first() == "don't()") {
                on = false
                return@sumOf 0
            } else if (it.groupValues.first() == "do()") {
                on = true
                return@sumOf 0
            }
            if (on) {
                it.groupValues[1].toInt() * it.groupValues[2].toInt()
            } else {
                0
            }
        }
    }
}

fun main() {
    val day = Day03()
    println(day.part1())
    println(day.part2())
}
