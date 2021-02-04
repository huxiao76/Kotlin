package com.thoughtworks.ppt

fun <T> joinToString(collection: Collection<T>,
                     separator: String = "-",
                     prefix: String = "[",
                     postfix: String = "]"): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
fun main() {
    val list = listOf(2, 4, 0)
    // 不标明参数名
    println(joinToString(list, " - ", "[", "]"))
    // 显式的标明参数名称
    println(joinToString(list, postfix = ")"))
}
