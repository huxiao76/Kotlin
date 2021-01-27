package com.thoughtworks.kotlin4

// 委托(delegation)

// 类委托

interface MyInterface {
    fun myPrint()
}

class MyInterfaceImpl(private val str: String) : MyInterface {
    override fun myPrint() {
        println("welcome $str")
    }

}

/*
    委托原理：
    by关键字后面的对象实际上会被存储在类的内部，编译器则会父接口中的所有方法实现出来，
    并且将实现转移给委托对象来实现
 */

class MyClass(myInterface: MyInterface): MyInterface by myInterface

fun main() {
    val myInterfaceImpl = MyInterfaceImpl("zhangsan")
    MyClass(myInterfaceImpl).myPrint()
}
