package com.thoughtworks.ppt

/*
* Kotlin会为类的参数自动实现get set方法
* */
class ModelKotlin(val name: String, val age: Int, val gender: Int, var address: String)

/*
* 用data关键词来声明一个数据类，除了会自动实现get set，还会自动生成equals hashcode toString copy
* */
data class ModelKotlin2(val name: String, val age: Int, val gender: Int, var address: String)

fun main() {
    println("Model2")
}
