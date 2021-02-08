    package com.thoughtworks.ppt

    data class PersonKotlin(var name: String = "zhangsan",
                       var age: Int =  20,
                       var addrss: String = "wuhan",
                       var emain: String = "123@tw.com")
    fun main() {
        val person: PersonKotlin = PersonKotlin( addrss = "shanghai")
    }
