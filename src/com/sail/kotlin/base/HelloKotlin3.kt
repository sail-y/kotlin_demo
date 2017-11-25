package com.sail.kotlin.base

/**
 *
 * @author yangfan
 * @date 2017/10/12
 */
fun main(args: Array<String>) {
//    var x = 10
//    var y = 20
//
//    var max: Int
//    var min: Int
//
//    if (x > y) {
//        max = x
//        min = y
//    } else {
//        max = y
//        min = x
//    }
//


//    var x = 10
//    var y = 20
//
//    var max = if (x > y) x else y
//    var min = if (x > y) y else x

    var x = 10
    var y = 20

    var max = if (x > y) {
        println("x > y")
        x
    } else {
        println("x <= y")
        y
    }

    var min = if (x > y) {
        println("x > y")
        y
    } else {
        println("x <= y")
        x
    }

    println("max = $max, min = $min")

}