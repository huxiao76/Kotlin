package com.thoughtworks.kotlin

fun main() {
    var array: IntArray = intArrayOf(1, 2, 3, 4);

    // 遍历元素
    for (item: Int in array) {
        println(item);
    }
    println("-------------");

    // 遍历索引
    for (i: Int in array.indices) {
        println("array[$i] = ${array[i]}");
    }
    println("-------------");

    // 同事遍历元素和索引
    for ((index, value) in array.withIndex()) {
        println("array[$index] = $value");
    }

}
