package com.thoughtworks.kotlin5

fun main() {
    val strings = arrayOf("hello", "world", "hello world", "welcome")
    strings.filter { it.contains("h") }.forEach { println(it) }

    println("---------")
    strings.filter { it.endsWith("d", true) }.map { it.toUpperCase() }.forEach { println(it) }
}

//private fun Array<String>.filter(predicate: (String) -> Boolean): ArrayList<String> {
//    var newArray = arrayListOf<String>()
//
//    for (index in 0 until size) {
//        if (predicate(elementAt(index))) {
//            newArray.add(elementAt(index))
//        }
//    }
//    return newArray
//}

