package com.sail.kotlin.demo

import java.util.function.Consumer

/**
 * kotlin是基于JVM的一门语言
 * @author yangfan
 * @date 2017/09/26
 */

fun main(args: Array<String>) {

    val list: List<String> = listOf("hello", "world", "hello wolrd")

    // 自动推断str为String类型
    for (str in list) {
        println(str)
    }

    println("------")

    // it表示当前引用
    list.forEach(Consumer { println(it) })

    println("------")

    list.forEach(System.out::println)
}