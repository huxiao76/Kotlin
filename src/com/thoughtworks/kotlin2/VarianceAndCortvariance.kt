package com.thoughtworks.kotlin2

/*
    kotlin: 声明处协变； Java： 使用处协变

    kotlin中的out关键字叫做variance annotation, 因为它是在类型参数声明处所指定的，因此我们
    称之为声明处协变(declaration-site variance)

    对于Java来说则是使用处协变（use-site variance）， 其中类型通配符使用类型协变成为可能。
 */

/*
    如果泛型类只是将泛型类型作为其方法的输出类型，那么我么就可以使用out

    produce = output =out
 */
interface Producer<out T> {
    fun produce(): T
}

/*
    如果泛型类只是将泛型类型作为其方法的输入类型，那么我么就可以使用in

    consume = input =in
 */

interface Consumer<in T> {
    fun consumer(item: T)
}

/*
    如果泛型类同时将泛型类型作为其方法的输入类型和输出类型，那么我们就不能使用out与in来修饰泛型
 */

interface ProducerConsumer<T> {
    fun product(): T
    fun consumer(item: T)
}


open class Fruit

open class Apple: Fruit()

class ApplePear: Apple()

class FruitProducer : Producer<Fruit> {
    override fun produce(): Fruit {
        TODO("Not yet implemented")
        println("Produce Fruit")

        return Fruit()
    }

}

class AppleProducer : Producer<Apple> {
    override fun produce(): Apple {
        TODO("Not yet implemented")
        println("Produce Apple")

        return Apple()

    }

}

class ApplePearProducer : Producer<ApplePear> {
    override fun produce(): ApplePear {
        TODO("Not yet implemented")
        println("Produce ApplePear")

        return ApplePear()
    }

}

fun main() {
    // 对于"out" 泛型来说，我们可以将子类型对象赋给父类型引用
    val producer1: Producer<Fruit> = FruitProducer()
    val producer2: Producer<Fruit> = AppleProducer()
    val producer3: Producer<Fruit> = ApplePearProducer()

    // 对于"in"泛型来说，我们可以将父类型对象赋值给子类型引用
    val consumer1: Consumer<ApplePear> = Human()
    val consumer2: Consumer<ApplePear> = Man()
    val consumer3: Consumer<ApplePear> = Boy()

}

class Human: Consumer<Fruit> {
    override fun consumer(item: Fruit) {
        TODO("Not yet implemented")
        println("Consume Fruit ")
    }
}

class Man : Consumer<Apple> {
    override fun consumer(item: Apple) {
        TODO("Not yet implemented")
        println("Consume Apple")
    }

}

class Boy : Consumer<ApplePear> {
    override fun consumer(item: ApplePear) {
        TODO("Not yet implemented")
        println("Consume ApplePear")
    }

}
