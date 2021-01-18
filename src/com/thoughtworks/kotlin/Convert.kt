package com.thoughtworks.kotlin

import java.lang.NumberFormatException

fun main() {
    println(convert2Int("ad"));
}

fun convert2Int(string: String): Int? {
    try {
        return string.toInt();
    } catch (ex: NumberFormatException) {
        return null;
    }
}

fun printMultiply(a: String, b: String) {
    val a2Int = convert2Int(a);
    val b2Int = convert2Int(b);
// 这里会报错，因为a2Int是Int?类型的，相当于java里面的Optional类型，后面可以用，是因为已经确定是Int了
//    println(a2Int * b2Int);

    if (null != a2Int && null != b2Int) {
        println(a2Int * b2Int);
    } else {
        println("param not int");
    }
}


