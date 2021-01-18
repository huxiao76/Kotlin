package com.function

fun main() {
    printMessage("Hello");
    printMessageWithPrefix("Hello", "Log");
    printMessageWithPrefix("Hello");
    printMessageWithPrefix(prefix = "Log", message = "Hello");
    println(sum(1, 2));
    println(multiply(2, 4));

    printMessage(1,2);
}

fun printMessage(message: String): Unit {
    println(message);
}
// 字符串模板
fun printMessageWithPrefix(message: String, prefix: String="Info") {
    println("[$prefix] $message");
}

fun printMessage(a: Int, b: Int) {
    println("$a + $b = ${a + b}");
}

fun sum(x: Int, y: Int): Int {
    return x + y;
}
// 返回值也可以省略
fun multiply(x: Int, y: Int) = x * y;
