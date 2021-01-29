package com.thoughtworks.kotlin5

import java.lang.StringBuilder

fun myCalculate(a: Int, b: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(a, b)
}

fun main() {
    println(myCalculate(2,3) { x, y -> x + y})
    println(myCalculate(2,3) { x, y -> x - y})
    println(myCalculate(2,3) { x, y -> x * y})
    println(filter1("abc2def"){str -> str.plus(2)})

    // 输出字母
    val str = "hollowed9"
    println(str.filter { it.isLetter() })
}

fun filter1(str: String, handle: (String) -> String): String {
    return handle(str)
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()

    for (index in 0 until length) {
        val element = get(index)

        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}


