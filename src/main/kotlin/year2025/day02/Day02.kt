package year2025.day02

import readInputAsString

class Day02(filePath: String) {
    private var sum = 0L
    val idRanges = readInputAsString(filePath)
        .split(",")
        .associate { intRange ->
            intRange.split("-").let {
                it[0].toLong() to it[1].toLong()
            }
        }

    fun part1(): Long {
        for (idRange in idRanges) {
            val blah = (idRange.key..idRange.value)
                .filter { it.toString().length.mod(2) == 0 }
                .filter {
                    val parts = it.toString().let { it.take(it.length / 2) to it.substring(it.length / 2) }
                    parts.first == parts.second
                }
            sum += blah.sum()
        }
        return sum
    }

    fun part2(): Long {
        for (idRange in idRanges) {
            (idRange.key..idRange.value).forEach {

                val range = (0..it.toString().length / 2)
                for (x in range) {
                    val blah2 = it.toString().substring(0, x)
                    if (it.toString().replace(blah2, "").isEmpty()) {
                        sum += it
                        break
                    }
                }
            }
        }
        return sum
    }
}