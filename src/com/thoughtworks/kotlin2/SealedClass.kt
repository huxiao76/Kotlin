package com.thoughtworks.kotlin2

/*
    密封类（sealed class）
    1、密封类表示父类和子类受限的层级关系，父类和直接子类必须在同一个文件里
    2、不能提供private方法
 */
sealed class Calculate

object Subtract : Calculate()

object Add : Calculate()


fun calculate(a: Int, b: Int, cal: Calculate) = when (cal) {
    is Add -> a + b
    is Subtract -> a - b
}

fun main() {
    println(calculate(1, 2, Add))

    println(calculate(4,2, Subtract))
}
