package year2025.day04

import readInput

class Day04(filePath: String) {

    private val map = mutableMapOf<Pair<Int, Int>, Char>()
    private var maxX = 0
    private var maxY = 0

    init {
        readInput(filePath)
            .mapIndexed { lineNumber, line ->
                line.mapIndexed { rowNumber, character ->
                    map[rowNumber to lineNumber] = character
                    maxY = rowNumber
                }
                maxX = lineNumber
            }
    }

    fun part1(): Int {
        var count = 0
        yLoop@ for (y in 0..maxY) {
            xLoop@ for (x in 0..maxX) {
                val char = map[x to y]
                if (char != '@') {
                    continue@xLoop
                } else {
                    val adjacent = listOfNotNull(
                        map[x - 1 to y - 1], map[x to y - 1], map[x + 1 to y - 1], //top
                        map[x - 1 to y], map[x + 1 to y], //middle
                        map[x - 1 to y + 1], map[x to y + 1], map[x + 1 to y + 1] //bottom
                    )
                    if (adjacent.count { it == '@' } < 4) {
                        count++
                    }
                }
            }
        }
        return count
    }

    fun part2(): Int {
        var total = 0
        var moreToFind = true

        while (moreToFind) {
            var found = 0
            yLoop@ for (y in 0..maxY) {
                xLoop@ for (x in 0..maxX) {
                    val char = map[x to y]
                    if (char != '@') {
                        continue@xLoop
                    } else {
                        val adjacent = listOfNotNull(
                            map[x - 1 to y - 1], map[x to y - 1], map[x + 1 to y - 1], //top
                            map[x - 1 to y], map[x + 1 to y], //middle
                            map[x - 1 to y + 1], map[x to y + 1], map[x + 1 to y + 1] //bottom
                        )
                        if (adjacent.count { it == '@' } < 4) {
                            map[x to y] = '.'
                            found++
                        }
                    }
                }
            }
            if (found == 0) {
                moreToFind = false
            } else {
                total += found
            }
        }
        return total
    }
}
