package com.thoughtworks.kotlin6

fun main() {
    val items = listOf(1, 2, 3, 4)
    println(items.first())
    println(items.last())

    items.filter { it % 2 == 0 }.forEach{ println(it)}

    println("-----------")

    val myList = mutableListOf(1, 2, 3)
    println(myList.requireNoNulls())

    if (myList.none{ it > 10}) {
        println("没有大于10的元素")
    }
    println(myList.firstOrNull())
    println(myList.lastOrNull())
    println("-----------")

    val myMap = hashMapOf("hello" to 0, "world" to 2)
    println(myMap["hello"])
    println(myMap.getValue("world"))
    println("-----------")

    val myMap2: Map<String, Int> = HashMap(myMap)
    println(myMap2)
}
