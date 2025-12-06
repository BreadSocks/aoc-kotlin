package year2025.day06

import readInput

class Day06(filePath: String) {

    private val map = mutableMapOf<Pair<Int, Int>, String>()
    private var maxX = 0
    private var maxY = 0
    private val input = readInput(filePath)

    init {
        readInput(filePath)
            .mapIndexed { lineNumber, line ->
                val values = line.trim().split("\\s+".toRegex())
                values.mapIndexed { rowNumber, value ->
                    map[rowNumber to lineNumber] = value
                    maxX = rowNumber
                }
                maxY = lineNumber
            }
    }

    fun part1(): Long {
        return (0..maxX).sumOf { x ->
            val numbers = map
                .filter { it.key.first == x }
                .values
                .toMutableList()
                .dropLast(1)
                .map { it.toLong() }
            val symbol = map[x to maxY]
            when (symbol) {
                "+" -> numbers.reduce(Long::plus)
                "-" -> numbers.reduce(Long::minus)
                "*" -> numbers.reduce(Long::times)
                "/" -> numbers.reduce(Long::div)
                else -> throw UnsupportedOperationException("")
            }
        }
    }

    fun part2(): Long {
        val maxX = input.maxOf { it.length }
        val problems = mutableListOf<Long>()
        var total = 0L
        column@ for (x in (maxX downTo 0)) {
            var number = ""
            row@ for (y in 0..input.lastIndex) {
                when (val character = input[y].getOrNull(x)) {
                    null -> continue@row
                    ' ' -> continue@row
                    '*' -> {
                        problems += number.toLong()
                        total += problems.fold(1L) { acc, lng -> acc * lng }
                        problems.clear()
                        continue@column
                    }

                    '+' -> {
                        problems += number.toLong()
                        total += problems.sum()
                        problems.clear()
                        continue@column
                    }

                    else -> number += character
                }
            }
            if (number.isNotEmpty()) {
                problems += number.toLong()
            }
        }
        return total
    }
}
