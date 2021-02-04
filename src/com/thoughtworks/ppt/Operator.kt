package com.thoughtworks.ppt

class Point(private val x: Int, private val y: Int) {

    /*
    * plus函数重载对Point对象的加法运算符
    * */
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    /*
    * minus函数重载对Point对象的减法运算符
    * */
    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }

    override fun toString(): String {
        return "[x:$x, y:$y]"
    }

}
