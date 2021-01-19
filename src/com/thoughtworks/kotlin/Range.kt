package com.thoughtworks.kotlin

fun main() {
    val a = 5
    val b = 10
    // in 关键词表示在区间里面
    if (a in 2..b) {
        println("in the range")
    }

    if (a !in 2..b) {
        println("out the range")
    }
    println("------------")

    for (i in 2..10) {
        println(i)
    }

    println("-----------")

    for (i in 2..10 step 2) {
        println(i)
    }

    println("-------")
    for (i in 10 downTo 2 step 4) {
        println(i)
    }
}
