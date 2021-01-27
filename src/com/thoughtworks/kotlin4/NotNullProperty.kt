package com.thoughtworks.kotlin4

import kotlin.properties.Delegates

// 非空属性
// notnull适用于那些无法在初始化阶段就确定属性值的场合

class MyPerson {
    var address: String by Delegates.notNull<String>()
}

fun main() {
    val myPerson = MyPerson()
    myPerson.address = "suzhou"
    println(myPerson.address)
}
