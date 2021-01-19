package com.thoughtworks.kotlin

// val属性可以被var属性override
// val属性不能override var属性
// val属性可以override val 属性
// 本质上，val相当于get方法，var相当于get和set放方法
open class Fruit {
    // 属性的重写
    open val name: String = "parent"
    // 方法的重写
    open fun name(): Unit {
        println("fruit")
    }

    fun expirationDate() {
        println("1 mouth")
    }
}

class Apple: Fruit() {
    override fun name() {
        println("orange")
    }
    override val name: String = "child"
}

open class Orange(override val name: String): Fruit() {
    // 不能被其子类重新的方法，但它可以重写父类的方法
    final override fun name() {
        println("orange")
    }
}

fun main() {
    var apple = Apple()
    // override
    apple.name()
    // inherit
    apple.expirationDate()
}
