package com.thoughtworks.ppt

internal interface CarKotlin {
    fun run()
    fun fire()
}

class BMWKotlin: CarKotlin {
    override fun run() {
        println("BMW:")
        fire()
    }

    override fun fire() {
        println("fire")
    }
}

class BMWAKotlin(baomaKotlin: BMWKotlin): CarKotlin by baomaKotlin {
    override fun fire() {
        println("BMW A fire")
    }
}

class BMWBKotlin(baomaKotlin: BMWKotlin): CarKotlin by baomaKotlin {
    fun music() {
        println("music")
    }
}

fun main() {
    BMWAKotlin(BMWKotlin()).fire()
    BMWBKotlin(BMWKotlin()).music()
}
