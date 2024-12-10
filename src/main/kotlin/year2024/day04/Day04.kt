package year2024.day04

import readInput
import kotlin.math.abs
import kotlin.math.sign

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
                if (char != 'X') {
                    continue@xLoop
                } else {
                    val leftToRight = listOfNotNull(char, map[x + 1 to y], map[x + 2 to y], map[x + 3 to y]).joinToString("")
                    val rightToLeft = listOfNotNull(char, map[x - 1 to y], map[x - 2 to y], map[x - 3 to y]).joinToString("")
                    val topToBottom = listOfNotNull(char, map[x to y + 1], map[x to y + 2 ], map[x to y + 3]).joinToString("")
                    val bottomToTop = listOfNotNull(char, map[x to y - 1], map[x to y - 2 ], map[x to y - 3]).joinToString("")
                    val bottomRight = listOfNotNull(char, map[x + 1 to y + 1], map[x + 2 to y + 2 ], map[x + 3 to y + 3]).joinToString("")
                    val topLeft = listOfNotNull(char, map[x - 1 to y - 1], map[x - 2 to y - 2 ], map[x - 3 to y - 3]).joinToString("")
                    val topRight = listOfNotNull(char, map[x + 1 to y - 1], map[x + 2 to y - 2 ], map[x + 3 to y - 3]).joinToString("")
                    val bottomLeft = listOfNotNull(char, map[x - 1 to y + 1], map[x - 2 to y + 2 ], map[x - 3 to y + 3]).joinToString("")
                    val results = listOf(leftToRight, rightToLeft, topToBottom, bottomToTop, bottomRight, topLeft, topRight, bottomLeft)
                    count += results.count { it == "XMAS" }
                }
            }
        }
        return count
    }

    fun part2(): Int {
        var count = 0
        yLoop@ for (y in 0..maxY) {
            xLoop@ for (x in 0..maxX) {
                val char = map[x to y]
                if (char != 'A') {
                    continue@xLoop
                } else {
                    val forwardSlash = listOfNotNull(map[x + 1 to y - 1], char, map[x - 1 to y + 1])
                    val backSlash = listOfNotNull(map[x - 1 to y - 1], char, map[x + 1 to y + 1])
                    if (forwardSlash.containsAll(backSlash) && backSlash.containsAll(forwardSlash) && forwardSlash.contains('M') && forwardSlash.contains('S')) {
                        count += 1
                    }
                }
            }
        }
        return count
    }
}

fun main() {
    val day = Day04("year2024/day04/input")
    println(day.part1())
    println(day.part2())
}
