package com.thoughtworks.kotlin

class EmptyClass

// 在kotlin中，一个类可以有一个primary 构造方法以及一个或多个secondary构造方法
// primary构造方法是类头（class header）的一部分，它位于类名后面，可以拥有若干参数
// 如果primary构造方法没有任何注解，或者可见性关键字修饰，那么constructor关键字可省略
// secondary构造方法必须直接或间接的调用primary构造方法

class MyClass constructor(){

}

class MyClass2 (username: String){
    private var username: String = username
    private var age: Int = 10
    private var address: String = "henan"

    // 初始化代码块
    init {
        println(username)
    }

    constructor(username: String, age: Int): this(username) {
        this.age = age
    }
    constructor(username: String, age: Int, address: String): this(username, age) {
        this.address = address
    }

    fun printInfo() {
        println("username: ${this.username} + age: ${this.age} + address: ${this.address}")
    }
}

fun main() {
    var myClass = MyClass2("zhangsan", 20, "beijing");
    myClass.printInfo()
}