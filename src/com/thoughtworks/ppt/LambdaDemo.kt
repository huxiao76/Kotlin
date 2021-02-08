package com.thoughtworks.ppt


class WorkerKotlin(private val strategy: () -> Unit) {
    fun work() {
        println("START")
        strategy.invoke()
        println("END")
    }
}

fun main() {

    val worker1 = WorkerKotlin {
        println("Do A Strategy")
    }

    val bStrategy = {
        println("Do B Strategy")
    }
    val worker2 = WorkerKotlin(bStrategy)
    worker1.work()
    worker2.work()
}
