package com.thoughtworks.ppt

class Worker(private val strategy: () -> Unit) {
    fun work() {
        println("START")
        strategy.invoke()
        println("END")
    }
}

fun main() {
    val worker1 = Worker {
        println("Do A Strategy")
    }
    val bStrategy = {
        println("Do B Strategy")
    }
    val worker2 = Worker(bStrategy)
    worker1.work()
    worker2.work()
}
