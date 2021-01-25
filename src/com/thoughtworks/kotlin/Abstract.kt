package com.thoughtworks.kotlin

// object declaration, 对象声明

object MYObject {
    fun method() {
        println("method")
    }
}

fun main() {
    MYObject.method()
    println("-----------")
    println(MYTest.a)        //伴生对象的属性类似于静态属性，kotlin没有静态属性
    MYTest.method()//伴生对象的方法类似于静态方法，kotlin没有静态方法
}

// companion object, 伴生对象（随着类的存在而存在）
// 在kotlin中，与java不同的是，类是没有static方法的
// 在大多数情况下，kotlin推荐的做法是使用包级别的函数来作为静态方法
// kotlin会将包级别的函数当做静态方法来看待
// 注意：虽然伴生对象的成员看起来像Java中的静态成员，但在运行期间，他们依旧是真实对象的实例成员
// 在JVM上，可以将伴生对象的成员真正生成类的静态方法和属性，这是通过@JvmStatic注解来实现
// 伴生对象在编译后会生成一个静态内部类

class MYTest {
    // 一个类中只有一个伴生对象
    // 如果不提供伴生对象的名字，则默认生成一个默认的名字Companion
    companion object MYObject {
        var a: Int = 100
        fun method() {
            println("method invoked")
        }
    }
}
