package com.thoughtworks.kotlin4

import kotlin.reflect.KProperty

// 委托属性(delegation property)

/*
    有4种情况在实际开发中比较常用：
    1、延迟属性： 第一次访问该属性，会执行一次运算，以后再访问该属性是从缓存里面读值而不再计算
    2、可观测属性： 相当于该属性有个监听器，赋值前或者赋值后都进行一些处理，对属性的赋值进行细粒度的控制
    3、非空属性
    4、map属性
 */
class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String = "$thisRef, your delegated property name is ${property.name}"
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) = println("$thisRef, new value is $value")
}

class MyProjectClass {
    var str: String by MyDelegate()
}

fun main() {
    val myProjectClass = MyProjectClass()
    myProjectClass.str = "hello world"
    println(myProjectClass.str)
}
