package com.sail.kotlin.base

/**
 *
 * @author yangfan
 * @date 2017/10/12
 */
fun main(args: Array<String>) {
    println(sum(1, 2))
    println(sum2(1, 2))
    myPrint(2, 3)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b


fun myPrint(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}