package com.thoughtworks.kotlin6

// Kotlin严格区分可变集合与不可变集合
// 要清楚的一点是： 区分开可变集合的只读视图与实际上真正的不可变集合

fun main() {
    val stringList: MutableList<String> = mutableListOf("hello", "world", "hello world")
    val readOnlyView: List<String> = stringList

    println(stringList)
    stringList.add("welcome")
    println(readOnlyView)
    // readOnlyView.clear() work err

    // 快照
    // toList扩展方法只是复制原集合中的元素，所以返回的集合就可以确保不会发生变化
    val items = mutableListOf("a", "b", "c")
    val items2 = items.toList()

    items.add("d")
    println(items)
    println(items2)
}
