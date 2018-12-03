package day2.star2

import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {
    for (i in 0 until getFileLines().size) {
        for (j in i + 1 until getFileLines().size) {
            val line1 = getFileLines()[i]
            val line2 = getFileLines()[j]
            if (line1.toCharArray().count() != line2.toCharArray().count()) {
                continue
            }
            if (line1.zip(line2).map { it.first == it.second }.filter { !it }.count() > 1) {
                continue
            }
            println(line1.zip(line2).filter { it.first == it.second }.map { it.first }.joinToString(""))

        }
    }
}


fun getFileLines(): List<String> {
    val inputStream: InputStream = File("src/day2/star2/input.txt").inputStream()
    val lineList = mutableListOf<String>()

    inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
    return lineList
}
