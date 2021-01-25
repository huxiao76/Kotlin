package com.thoughtworks.kotlin

class Extension {
    fun add(a: Int, b: Int) = a + b
    fun subtract(a: Int, b: Int) = a - b
}

fun Extension.multiply(a: Int, b: Int) = a * b

fun main() {
    var extensionTest = Extension()

    println(extensionTest.add(2, 3))
    println(extensionTest.multiply(2, 4))
    println("--------------")
    myPrint(BB()) // a

    println("----------")

    var cc = CC()
    cc.foo(1)
}
// 扩展函数的解析是静态的
/**
 * 1、扩展本身并不会真正修改目标类，也就是说它并不会在目标类中插入新的属性或是方法
 * 2、扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型
 * 3、调用是由对象声明类型所决定的，而不是由对象的实际类型决定
 */

open class AA

class BB: AA()

fun AA.a() = "a"

fun BB.a() = "b"

fun myPrint(aa: AA) {
    println(aa.a())
}

class CC {
    fun foo() {
        println("member")
    }
}

// 支持重载
fun CC.foo(i: Int) {
    println("member2")
}

// 可空类型的扩展，在只用的时候不用空检查，而在声明的时候进行空检查
fun Any?.toString(): String {
    if (null == this) {
        return "null"
    }
    return toString()
}

