package com.thoughtworks.kotlin

class EmptyClass

// 在kotlin中，一个类可以有一个primary 构造方法以及一个或多个secondary构造方法
// primary构造方法是类头（class header）的一部分，它位于类名后面，可以拥有若干参数
// 如果primary构造方法没有任何注解，或者可见性关键字修饰，那么constructor关键字可省略
// secondary构造方法必须直接或间接的调用primary构造方法
// 属性可以写在构造方法里面

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

class Student (private val username: String, private val age: Int, private var address: String) {
    fun printInfo() {
        println("username: $username, age: $age, address: $address")
    }
}

/**
 * 如果构造方法拥有注解或者可见性修饰符
 * 那么constructor关键字就是不能省略掉的，并且它位于修饰符后面
 */

class Student2 private constructor(username: String) {

}
/**
 * 在JVM里，如果primary构造方法的所有参数都拥有默认值，编译器则生成一新的个不带参数的构造方法，
 * 这个不带参数的构造方法会使用这些参数的默认值，这样做的目的在于可以跟Spring等框架更好地集成
 */
class Student3(val username: String = "zhangsan")

fun main() {
    var myClass = MyClass2("zhangsan", 20, "beijing");
    myClass.printInfo()
    var student = Student("zhangsan", 20, "beijing")
    student.printInfo()

    var student3 = Student3()
    println(student3.username)

    var student4 = Student3("lisi")
    println(student4.username)
}
