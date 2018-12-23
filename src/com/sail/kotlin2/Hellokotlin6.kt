package com.sail.kotlin2

import kotlin.test.assertTrue

/**
 *
 * use-site variance(type projection), 类型投影
 *
 * @author yangfan
 * @date 2018/12/23
 */


// 数组的浅拷贝
fun copy(from: Array<out Any>, to: Array<Any>) {
    assertTrue(from.size == to.size)

    for (i in from.indices) {
        to[i] = from[i]
    }
}

fun main(args: Array<String>) {
    val from: Array<Int> = arrayOf(1, 2, 3, 4)
    //val to: Array<Any> = Array<Any>(4, { it -> "hello" + it })
    val to: Array<Any> = Array<Any>(4) { "hello" + it }

    for (item in to) {
        println(item)
    }

    copy(from, to)

    println("**********")

    val array: Array<String> = Array(4, { _ -> "hello" })

    for (item in array) {
        println(item)
    }

    setValue(array, 1, "world")

    println("**********")

    for (item in array) {
        println(item)
    }

    val array2: Array<Any> = Array(4, { "hello" + it })

    println("**********")

    for (item in array2) {
        println(item)
    }

    setValue(array2, 1, "world")
    println("**********")

    for (item in array2) {
        println(item)
    }

}

fun setValue(to: Array<in String>, index: Int, value: String) {
    to[index] = value
}
