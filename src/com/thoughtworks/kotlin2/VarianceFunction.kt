package com.thoughtworks.kotlin2

// 泛型函数

fun <T> getValue(item: T): T {
    return item
}

fun main() {
    val item = getValue(3)
    println(item)

    val item2 = getValue("hello")
    println(item2)

    val upperBounds = UpperBoundsClass2<String>()
}

class UpperBoundsClass<T : List<Thread>> {

}

class UpperBoundsClass2<T> where T: Comparable<T>, T: Any {

}
