package com.thoughtworks.kotlin5

/*
    内联函数（inline function）:

    普通函数调用，A调用B,就是调用一下，把堆栈信息保存，然后再把堆栈信息弹出
    内联函数调用， A调用B,把B整个方法体的代码拷贝到A的调用处。坏处：导致生成的字节码比较大
 */

inline fun myCalculate(a: Int, b: Int) = a + b

fun main() {
    println(myCalculate(1, 2))
}
