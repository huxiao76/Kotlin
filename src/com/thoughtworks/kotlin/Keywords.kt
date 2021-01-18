package com.thoughtworks.kotlin

fun main() {
    // 底层是由System.out.println()实现的，所以可以用快捷方式 sout 点return 补全
    println();
}

fun convert2Uppercase(str: Any): String? {
    if (str is String) {
        return str.toUpperCase();
    } else {
        return null;
    }

    // java的实现形式,差别在于java编译器不能自动识别参数类型，需要转换
//    if (str instanceof String) {
//        String str2 = (String) str;
//        return str2.toUpperCase();
//    }
}
