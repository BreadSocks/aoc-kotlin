package year2025.day05

import readInputAsString

class Day05(filePath: String) {
    val input = readInputAsString(filePath)
        .split("\n\n")
    val ingredientIds = input[1]
        .split("\n")
        .map { it.toLong() }
    val freshIdRanges = input[0].split("\n")
        .map { it.split("-").map { it.toLong() } }
        .map { it[0]..it[1] }


    fun part1(): Int {
        return ingredientIds.count { ingredientId ->
            freshIdRanges.any { ingredientId in it }
        }
    }

    fun part2(): Long {
        val newList = mutableListOf<LongRange>()
        freshIdRanges.sortedBy { it.first() }.forEach { idRange ->
            val overlap = newList.filterIndexed { index, longs -> idRange.first() in longs || idRange.last() in longs }
            if (overlap.isEmpty()) {
                newList.add(idRange)
            } else {
                val lists = overlap + listOf(idRange)
                newList.removeAll(lists)
                newList.add(lists.minOf { it.first }..lists.maxOf { it.last })
            }
        }

        return newList.sumOf { it.last - it.first + 1 }
    }
}