package year2025.day03

import readInput

class Day03(filePath: String) {
    val banks = readInput(filePath)
        .map { it.toList().map { it.digitToInt() } }

    fun part1(): Int {
        val total = banks.sumOf { bank ->
            val highest = bank.max()
            val indexOfHighest = bank.indexOf(highest)
            when (indexOfHighest) {
                0 -> "${highest}${bank.subList(1, bank.lastIndex).max()}".toInt()
                bank.lastIndex -> "${bank.subList(0, bank.lastIndex).max()}${highest}".toInt()
                else -> {
                    val leftHighest = bank.subList(0, indexOfHighest).max()
                    val rightHighest = bank.subList(indexOfHighest + 1, bank.lastIndex + 1).max()
                    val option1 = "$leftHighest$highest".toInt()
                    val option2 = "$highest$rightHighest".toInt()
                    listOf(option1, option2).max()
                }
            }
        }
        return total
    }

    fun part2(): Long {
        val total = banks.sumOf { bank ->
            val stack = mutableListOf<Int>()
            var digitsRequired = 12
            var indexOfLastAdded = -1
            val lastSuitableIndex = { bank.count() - digitsRequired + 1 }
            while (digitsRequired != 0) {
                val subList = bank.subList(indexOfLastAdded + 1, lastSuitableIndex())
                val max = subList.max()
                stack.add(max)
                indexOfLastAdded = subList.indexOf(max) + indexOfLastAdded + 1
                digitsRequired -= 1
            }
            stack.joinToString(separator = "").toLong()
        }
        return total
    }
}