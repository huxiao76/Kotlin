package com.thoughtworks.kotlin5

import kotlin.Unit

/*
    带接收者的函数字面值

    kotlin提供了这样一种功能：可以通过指定的接收者对象来调用一个函数字面值
    在函数字面值内部，你可以调用接收者对象的方法而无需使用任何额外的修饰符

    这一点非常类似于扩展函数，
 */

fun main() {
    val substract: Int.(other: Int) -> Int = {other -> this - other }

    println(1.substract(3))

    println("-------------")

    /*
        匿名函数语法可以让我们指定函数字面值的接收者类型。这样，我们就可以以先去声明一个带有接收者的函数类型变量，然后再去使用它
     */
    val sum = fun Int.(other: Int): Int = this + other

    println(1.sum(2))

    println("--------------")

    /*
        带有接收者类型的函数的非字面值可以作为参数进行传递，前提是所需要接收函数的地方应该有一个接收者类型的参数，反之亦然。
        比如说：类型 String.(Int) -> Boolean 与 （String， Int）-> Boolean 等价
     */

    val myEquals: String.(Int) -> Boolean = {param -> toIntOrNull() == param}
    println("12345".myEquals(12345))

    println("-------------")
    fun myTest(op: (String, Int) -> Boolean, a: String, b: Int, c: Boolean): Unit = println(op(a, b) == c)
    myTest(myEquals, "200", 200,true)
}
