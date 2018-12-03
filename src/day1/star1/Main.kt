package day1.star1

import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {
    var frequency = 0
    getFileLines().forEach { frequency += it.toInt() }
    println(frequency)
}

fun getFileLines(): List<String> {
    val inputStream: InputStream = File("src/day1/star1/input.txt").inputStream()
    val lineList = mutableListOf<String>()

    inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it)} }
    return lineList
}
