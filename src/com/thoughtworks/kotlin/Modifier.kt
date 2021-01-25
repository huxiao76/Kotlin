package com.thoughtworks.kotlin

// 可见性 visibility
// Kotlin提供了4种可见性修饰符：private, protected, internal, public

// 其中internal是只能在一个模块里可用，并且不能用在首层，可以用在类的属性上，则凡是可以访问那个类的都可以访问这个属性

open class Clazz {
    private val b = 3;
    protected open val c = 4;
    internal val d = 5;
}

class SubClazz: Clazz() {
    val b = 4;
//    val c = 5; 可以访问到父类的属性
//    val d = 6; 可以访问到父类的属性
}

class Clazz2 {
    // 可以访问到internal 属性d
}
