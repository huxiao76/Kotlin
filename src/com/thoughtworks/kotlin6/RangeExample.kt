package com.thoughtworks.kotlin6

// Range

fun main() {
    var i = 4

    if (i in 1..5) {
        println(i)
    }
    println("-----------")

    for (a in 1..4) {
        println(a)
    }
    println("-----------")

    for (a in 4..1) {
        println("这里不存在")
    }

    for (a in 4 downTo 1) {
        println(a)
    }

    for (a in 1..6 step 2) {
        println(a)
    }

    for (a in 1 until 5) {
        println(a)
    }
}
