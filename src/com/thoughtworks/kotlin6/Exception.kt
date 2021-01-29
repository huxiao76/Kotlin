package com.thoughtworks.kotlin6

import java.lang.IllegalArgumentException
import java.lang.Integer.parseInt
import java.lang.NumberFormatException

// 异常， kotlin中的try是个表达式，java的try是代码块没有返回结果
// Kotlin中是没有checked exception的

// throw 在kotlin中是个表达式，这样我们可以将throw作为Elvis表达式的一部分
// throw表达式的类型是一种特殊的类型：Nothing
// 在自己的代码中，可以使用Nothing来标记永远不会返回的函数
fun main() {
    val a = "3"

    val result: Int? = try {
        parseInt(a)
    } catch (ex: NumberFormatException) {
        null
    } finally {
        println("finally invoked")
    }
    println(result)

    val str: String? = "a"
    val str2 = str ?: throw IllegalArgumentException("值不能为空")
    println("--------------")

    var s = null
    println(s is Nothing?)

    var s2 = listOf(null)
    println(s2 is List<Nothing?>)


}
