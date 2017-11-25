package com.sail.kotlin.base

//import com.sail.kotlin.base.multiply
import com.sail.kotlin.base.multiply as myMultiply

/**
 *
 * @author yangfan
 * @date 2017/10/12
 */
fun main(args: Array<String>) {
    val a: Int = 1
    val b = 2

    var c: Int
    c = 3

    var d = 3
    d = 4

    println(d)

    var x = 10
    var y: Byte = 20

    x = y.toInt()

    println(x)


    println(myMultiply(2 ,3))
}