package com.thoughtworks.kotlin2

import java.lang.NumberFormatException

// star projection(星投影)

// Star<out T>: 如果T的上界是TUpper，那么Star<*>就相当于Start<out T>.
// 这就表示T的类型未知时，你可以从Star<*>当中安全地读取TUpper类型的值

// Star<in T>: Star<*>就相当于Star<in Noting>.这表示你无法向其中写入任何值

// Star<T>, 如果T的上界为TUpper，那么Star<*>就相当于读取时的Star<out TUpper>以及
// 写入时的Star<in Nothing>

class Star<out T>{

}

class Star2<in T>{
    fun setValue(t: T) {

    }
}

class Star3<T>(private var t: T) {
    fun setValue(t: T) {

    }
    fun getValue(): T {
        return this.t
    }
}

fun main() {
    val star: Star<Number> = Star<Int>()
    val star2: Star<*> = star

    val star3: Star2<Int> = Star2<Number>()
    val star4: Star2<*> = star3

    // star4.setValue(3) // compile error

    val star5: Star3<String> = Star3<String>("hello")
    val star6: Star3<*> = star5

    star6.getValue()
    // star6.setValue("") // compile error
}
