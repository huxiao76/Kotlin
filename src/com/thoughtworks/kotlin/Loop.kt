package com.thoughtworks.kotlin

fun main() {
    // 和java一样
//    var x = 10;
//    var y = 20;
//    var max: Int;
//    var min: Int;
//    if (x > y) {
//        max = x;
//        min = y;
//    } else {
//        max = y;
//        min = x;
//    }

//    var x = 10;
//    var y = 20;
//    // 把if表达式的值返回
//    var max = if (x > y) x else y;
//    var min = if (x > y) y else x;

    var x = 10;
    var y = 20;
    var max = if (x > y) {
        println("x > y");
        x;
    } else {
        println("x <= y");
        y;
    }
    var min = if (x > y) {
        println("x > y");
        y;
    } else {
        println("x <= y");
        x;
    }
    println("max = $max, min = $min");
}
