package com.thoughtworks.kotlin5

/*
    闭包
    任何支持函数式编程的语言都都支持闭包
    kotlin 和 java的内层函数都可以访问外层函数的变量，但是kotlin可以修改外层函数的变量，java不可以修改

    闭包的作用
    1、让函数成为编程语言中的一等公民
    2、让函数具有对象所有的能力（封装）
    3、让函数具有状态
 */

fun main() {
    var sum = ""
    val strings = arrayOf("hello", "world", "bye")
    strings.filter { it.length > 3 }.forEach {
        sum += it
    }
    println(sum)
}
