package com.thoughtworks.kotlin2

import kotlin.test.assertEquals
// use-site variance(type projection), 类型投影
// 解决泛型使用的时候不合理的地方

// 数组的浅拷贝
fun copy(from: Array<out Any>, to: Array<Any>) {
    assertEquals(from.size, to.size)

    for (i in from.indices) {
        to[i] = from[i]
    }

}

fun main() {
    val from: Array<Int> = arrayOf(1, 2, 3, 4)
    val to: Array<Any> = Array<Any>(4) { "hello$it" }

    for (item in to) {
        println(item)
    }

    copy(from, to)
    println("-------------")

    val array: Array<String> = Array(4) { "hello"}
    for (item in array) {
        println(item)
    }

    setValue(array, 1 , "world")

    for (item in array) {
        println(item)
    }

    println("-----------")

    val array2: Array<Any> = Array(4) {"hello$it"}

    setValue(array2, 1, "world")
    for (item in array) {
        println(item)
    }

    println("-----------")


}

fun setValue(to: Array<in String>, index: Int, value: String) {
    to[index] = value
}


