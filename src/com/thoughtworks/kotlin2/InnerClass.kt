package com.thoughtworks.kotlin2

// 内部类（Inner Class）

/*
    关于嵌套类与内部类之间的区别与联系
    1、嵌套类： 对应于Java的静态内部类（即有static关键字修饰的内部类），只要一个类的内部定义了另外一个类，那么这个类
    就叫做嵌套类，相当于Java当中static关键字修饰的内部类
    2、内部类： 对应于Java中的非静态内部类（即没有static关键字修饰的内部类），使用inner关键字在一个类的内部所定义的另外一个
    类就叫做内部类，相当于Java当中没有static关键字修饰的内部类。
 */

class OutterClass2 {
    private var str: String = "hello world"

    inner class InnerClass {
        fun innerMethod() = "welcome"
    }
}

fun main() {
    println(OutterClass2().InnerClass().innerMethod())
}
