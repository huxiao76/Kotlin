package com.thoughtworks.kotlin

/**
 * var propertyName: propertyType = initializer
 * getter()...
 * setter()...
 * backing field, 支持字段（域）
 * backing property, 支持属性
 */
class ThePerson(address: String, name: String) {
    val age: Int = 20;

    var address: String = address
    get() {
        return field
    }
    set(value) {
        field = value
    }

    var name  = name
    private set
}

fun main() {
    var thePerson = ThePerson("wuhan", "zhangsan")
    println(thePerson.age)

    println(thePerson.address)

    println(thePerson.name)

}
