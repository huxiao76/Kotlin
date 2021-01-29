package com.thoughtworks.kotlin5

/*
    匿名函数
    匿名函数不能放在函数外面，因为没有名字所以永远不能被调用
    主要是在lambda表达式中使用

    lambda表达式的返回外层函数
    匿名函数的返回是匿名函数本身
 */


fun main() {
    val strings = arrayOf("hello", "world", "bye")
    strings.filter { it.length > 3 }
    strings.filter(fun (item): Boolean = item.length > 3).forEach(
            fun(item){ println(item)}
    )
}
