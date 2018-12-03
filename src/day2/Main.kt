package day2

import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {
    var doubles = 0
    var triples = 0
    for (line in getFileLines()) {
        val charsArray = line.toCharArray()
        charsArray.groupBy { it }.filterValues { it.size > 1 }.values.toList().map { it.size }.distinct().let {
            it.forEach {
                if (it == 2) doubles++
                if (it == 3) triples++
            }
        }

    }
    println("Doubles: $doubles, Triples: $triples.\nChecksum : ${doubles * triples}")
}

fun getFileLines(): List<String> {
    val inputStream: InputStream = File("src/day2/input.txt").inputStream()
    val lineList = mutableListOf<String>()

    inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
    return lineList
}
