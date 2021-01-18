package com.thoughtworks.kotlin

fun main() {
    // val定义kotlin的常量
    val a: Int = 1;
    // kotlin类型推断出b是Int类型的常量
    val b = 2;

    // var 定义kotlin的变量
    var c:Int;
    c = 3;
    c = 4;

    var d = 4;

    // 禁止小范围类型的变量直接赋值给大范围类型的变量，java是可以的
    var x = 10;
    var y: Byte = 20;
    x = y.toInt();
    println(x);
    println("------------");

    // 把第1个元素改成4
    val m = intArrayOf(1, 2, 3);
    m.set(0, 4);
    for (item in m) {
        println(item);
    }

}
