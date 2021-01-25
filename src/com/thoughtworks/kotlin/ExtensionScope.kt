package com.thoughtworks.kotlin
// 扩展的作用： 可以让使用者在不修改原代码的情况下，并且又不借助于装饰模式的任何一种设计模式的
// 情况下，提供方便快捷的实现方式
// 扩展的作用域
/**
 * 1、扩展函数所定义的类实例叫做分发接收者（dispatch receiver）
 * 2、扩展函数所扩展的那个类的实例叫做扩展接收者(extension receiver)
 * 3、当以上两个名字出现冲突时，扩展接收者的优先级最高
 */

class DD {
    fun method() = println("DD method")
}

class EE {
    fun method2() = println("EE method")

    fun DD.hello() {
        method()
        method2()
    }

    fun world(dd: DD) {
        dd.hello()
    }

    fun DD.output() {
        println(toString())
        println(this@EE.toString())
    }

    fun test() {
        var dd = DD()
        dd.output()
    }
}

fun main() {
    EE().test()
}

// 扩展可以很好地解决java中的各种辅助类问题
// Collections.swap(list, 4, 10)
// list.swap(4, 10)  kotlin的扩展实现方式
// Collection.binarySearch()
// list.binarySearch()
