package com.sail.kotlin.base

/**
 *
 * @author yangfan
 * @date 2017/10/27
 */
fun main(args: Array<String>) {
    var array = intArrayOf(1, 2, 3, 4, 5)

    for (item in array) {
        println(item)
    }

    println("----------")

    for (i: Int in array.indices) {
        println("array[$i] = ${array[i]}")
    }

    println("----------")


    for ((index, value) in array.withIndex()) {
        println("array[$index] = $value")
    }
}