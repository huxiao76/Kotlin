package com.thoughtworks.ppt

fun String.firstChar(): String {
    if (this.isEmpty()) {
        return ""
    }
    return this[0].toString()
}

fun String.lastChar(): String {
    if (this.isEmpty()) {
        return ""
    }
    return this[this.length - 1].toString()
}

fun main() {
    val str: String = "abc"
    println(str.firstChar())
    println(str.lastChar())
}
