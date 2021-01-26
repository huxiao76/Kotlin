package com.thoughtworks.kotlin2

class Person1(val name: String, var age: Int) {
    private inner class PersonFeature(var height: Int, var weight: Int) {
        fun getPersonFeature() {
            println("身高： $height, 体重：$weight")

            this@Person1.method()
        }
    }

    private fun method() {
        println("执行了Person1的method方法")
    }

    fun getPerson() {
        val personFeature = PersonFeature(120, 100)
        personFeature.getPersonFeature()
    }

}

fun main() {
    val person = Person1("zhangsan", 20)
    person.getPerson()
}
