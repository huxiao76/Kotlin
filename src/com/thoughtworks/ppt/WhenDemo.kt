package com.thoughtworks.ppt

fun main() {
}

fun getPoint2(grade: Int) = when (grade) {
    in 90..100 -> "优秀"
    in 70 until 90 -> "良好"
    in 60 until 70 -> "及格"
    in 0 until 60 -> "加油"
    else -> ""
}


