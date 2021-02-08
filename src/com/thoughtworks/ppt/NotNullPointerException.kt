    package com.thoughtworks.ppt

    fun testNullType() {
        val a: String = "aa"
        // a是非空类型，下面的给a赋值为null将会编译不通过
        // a = null
        a.length

        // ？声明是可空类型，可以赋值为null
        var b: String? = "bb"
        b = null

        // b是可空类型，直接访问可空类型将编译不通过，需要通过?.或者!!.来访问
        // b.length
        b?.length  // 安全调用符？，只有在b != null时，才会去调用其length属性。
        b!!.length // 非空断言!!，遇到null时，抛出空指针异常

        /**
         * ?:符号会在符号左边为空的情况才会进行下面的处理，不为空则不会有任何操作
         */
        fun testElvis2(input: String?, user: User?) {
            val b = input?.length ?: -1;
            user?.save() ?: User().save()
        }

    }

    class User {
        fun save(): Boolean {
            return true
        }

    }
