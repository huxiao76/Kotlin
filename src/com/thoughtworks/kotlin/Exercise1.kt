package com.thoughtworks.kotlin

fun main() {
    var array = listOf<String>("hello", "world", "hello world", "welcome", "goodbye");

    for (item in array) {
        println(item)
    }

    println("----------")

    when {
        "world" in array -> println("world in collection")
    }
    println("-----------")

    var array2 = mutableListOf<String>();
    for (item in array) {
        if (item.length > 5) {
            item.toUpperCase()
            array2.add(item)
        }
    }

    array2.sort();
    for (item in array2) {
        println(item)
    }

    println("--------")

    array.filter { it.length >5 }.map { it.toUpperCase() }.sorted().forEach { println(it) };

}
