package com.thoughtworks.kotlin6

import kotlin.reflect.KClass

// 注解（annotation）
// meta-annotation(元注解)
/*
    注解也可以拥有自己的构造方法，并且构造方法也可以接收参数

    注解构造方法所允许的参数类型：

    与Java原生类型所对应的类型（Int, Long..）
    字符串：string
    classes (MyClass::class)
    枚举： enums
    其他的注解
    上述类型的数组类型
 */

// kotlin的注解参数是不允许为可空类型的，因为JVM不支持以null的形式存储注解属性值得。
// 如果某个注解被用作其他注解的参数，那么其名字就不需要以@字符开头

// 注解的定义和声明
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.FIELD, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class MyAnnotation

@MyAnnotation
class MyClaa {
    @MyAnnotation
    fun myMethod(a: Int): Int {
        return 10
    }
}

annotation class MyAnnotation2(val str: String)

@MyAnnotation2("hello")
class MyClass4

annotation class MyAnnotation3(val str: String, val myAnnotation: MyAnnotation2)

@MyAnnotation3("test", MyAnnotation2("welcome"))
class MyClass5

/*
    如果需要将某个class作为注解的参数，那么请使用kotlin class(KCLass)
    这样，Java代码就可以正常看到注解与参数了。
 */

annotation class MyAnnotation4(val argl: KClass<*>, val argl2: KClass<out Any>)

@MyAnnotation4(String::class, Int::class)
class MyClass6

// 注解使用处目标（use-site target）

/*
    在对类的属性或是柱构造方法的参数声明注解时，会存在多个java元素都可以通过对应的Kotlin元素生成出来，
    因此，在所生成的java字节码中，就会存在多个可能得位置来生成相应的注解，若想精确指定如何来生成注解，那么可以
    使用注解的使用处目标方式来实现。
 */

class MyClass7(
        @field: MyAnnotation val argl1: String,  // 注解 Java field
        @get: MyAnnotation val argl2: String,    // 注解 Java getter
        @param: MyAnnotation val argl3: String   // 注解 Java构造方法参数
)
