package com.thoughtworks.kotlin

fun main() {
    println(myPrint("hello"));
    println(myPrint("test"));

    var a = 6
    // 表达式必须是穷尽的，必须有else
    var result = when (a) {
        1 -> {
            println("a = 1");
            10;
        }
        2 -> {
            println("a = 2");
            20;
        }
        3,4,5 -> {
            println("a = 3 or 4 or 5")
            30
        }
        // ..是闭区间，java是前闭后开的，并且..是运算符重写，java没有运算符重写
        in 6..10 -> {
            println("a is between 6 and 10")
            40
        }
        else -> println("a is other value");
    }
}

// 类似于switch case
fun myPrint(str: String): String {
    return when (str) {
        "hello" -> "HELLO";
        "world" -> "WORLD";
        "hello world" -> "HELLO WORLD";
        else -> "other input";
    }
}

fun myPrint2(str: String): String =
     when (str) {
    "hello" -> "HELLO";
    "world" -> "WORLD";
    "hello world" -> "HELLO WORLD";
    else -> "other input";
     }
