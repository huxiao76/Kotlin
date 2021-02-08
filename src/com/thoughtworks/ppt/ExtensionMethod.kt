    package com.thoughtworks.ppt

    fun main() {
        val str: String = "hello world"
        println(str.reverse());
        println(str.sort(false))
        println(str.sort(true))
    }

    fun String.reverse(): String {
        val arr = this.toCharArray()
        for (i in 0 until arr.size / 2) {
            val temp = arr[i]
            arr[i] = arr[arr.size - 1 - i]
            arr[arr.size - 1 - i] = temp
        }
        return String(arr)
    }

    fun String.sort(desc: Boolean): String {
        val arr = this.toCharArray()
        for (i in 0 until arr.size - 1) {
            var min = i
            for (j in i + 1 until arr.size) {
                if (arr[j] < arr[min]) {
                    min = j
                }
            }
            val tmp = arr[i]
            arr[i] = arr[min]
            arr[min] = tmp
        }

        return if (desc) {
            String(arr).reverse()
        } else {
            String(arr)
        }
    }

