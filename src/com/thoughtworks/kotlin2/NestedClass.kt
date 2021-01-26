package com.thoughtworks.kotlin2

// 嵌套类(Nested Class)

class OuterClass {
    private val str: String = "hello world"

    class NestedClass {
        fun nestedMethod() = "welcome"
    }
}

fun main() {
    println(OuterClass.NestedClass().nestedMethod())
}
