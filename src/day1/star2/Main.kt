package day1.star2

import java.io.File
import java.io.InputStream

var frequency = 0

fun main(args: Array<String>) {
    val usedFrequencies = mutableListOf<Int>(0)
    while (true) {
        if (findReusedFrequency(usedFrequencies)) {
            break
        }
    }
}

fun findReusedFrequency(usedFrequencies: MutableList<Int>): Boolean {
    getFileLines().forEach {
        frequency += it.toInt()
        if (usedFrequencies.contains(frequency)) {
            println(frequency)
            return true
        }
        usedFrequencies.add(frequency)
        println("Frequency not found")
    }
    return false
}

fun getFileLines(): List<String> {
    val inputStream: InputStream = File("src/day1/star2/input.txt").inputStream()
    val lineList = mutableListOf<String>()

    inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
    return lineList
}
