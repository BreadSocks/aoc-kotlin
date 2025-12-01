package year2025.day01

import readInput

class Day01(filePath: String) {
    private var position: Int = 50
    private var count = 0
    val lines = readInput(filePath)
        .map { it[0] to it.substringAfter(it[0]).toInt() }

    fun part1(): Int {
        lines.forEach { line ->
            position = if (line.first == 'R') {
                position + line.second
            } else {
                position - line.second
            }.mod(100)
            if (position == 0) {
                count++
            }
        }
        return count
    }

    fun part2(): Int {
        lines.forEach { line ->
            repeat(line.second) {
                if (line.first == 'R') {
                    position++
                    if (position == 100) {
                        position = 0
                        count++
                    }
                } else if (line.first == 'L') {
                    position--
                    if (position == -1) {
                        position = 99
                    } else if (position == 0) {
                        count++
                    }
                }
            }
        }
        return count
    }
}