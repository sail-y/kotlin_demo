package com.sail.kotlin3

/**
 * 嵌套类（Nested Class）
 *
 * @author yangfan
 * @date 2018/12/24
 */
class OuterClass {
    private val str: String = "hello world"

    class NestedClass {
        fun nestedMethod() = "welcome"
    }
}

fun main(args: Array<String>) {
    println(OuterClass.NestedClass().nestedMethod())
}