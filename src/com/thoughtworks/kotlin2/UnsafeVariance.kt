package com.thoughtworks.kotlin2

class MyStorage<out T>(private var t: T) {
    fun getValue(): T {
        return this.t
    }

    fun setValue(t: @UnsafeVariance T) {
        this.t = t
    }
}

fun main() {
    var myStorage: MyStorage<Int> = MyStorage(5)
    val myStorage2: MyStorage<Any> = myStorage

    println(myStorage2.getValue())

    myStorage2.setValue("hello") // 泛型擦除

    println(myStorage2.getValue())
}
