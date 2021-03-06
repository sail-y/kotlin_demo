package com.sail.kotlin.base

/**
 *
 * @author yangfan
 * @date 2017/10/27
 */
fun main(args: Array<String>) {
    println(myPrint("hello"))
    println(myPrint("world"))
    println(myPrint("test"))

    println("-----")

    println(myprint2("test"))

    println("-----")


    var a = 6

    var result = when (a) {
        1 -> {
            println("a = 1")
            10
        }

        2 -> {
            println("a = 2")
            20
        }
        3, 4, 5 -> {
            println("a = 3 or 4 or 5")
            30
        }
        in 6..10 -> {
            println("a is between 6 and 10")
        }
        else -> {
            println("a is other value")
            50
        }
    }

    println(result)
}


fun myPrint(str: String): String {
    when (str) {
        "hello" -> return "HELLO"
        "world" -> return "WORLD"
        "hello world" -> return "HELLO WORLD"
        else -> return "other input"
    }
}

fun myprint2(str: String): String =
        when (str) {
            "hello" -> "HELLO"
            "world" -> "WORLD"
            "hello world" -> "HELLO WORLD"
            else -> "other input"
        }