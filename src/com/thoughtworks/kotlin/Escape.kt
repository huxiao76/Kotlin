package com.thoughtworks.kotlin

fun main() {
    var a: String = "hello \\n world"
    println(a)

    // 三个双引号会把引号里面的所有内容原封不动的打印出来，适用于string中转义字符比较多的情况
    var b: String = """hello \n world welcome"""
    println(b)
}
