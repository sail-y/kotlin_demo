package com.sail.kotlin3

/**
 * 如何在外面调用内部类
 * @author yangfan
 * @date 2019/03/20
 */
class OuterClass5 {
    inner class NestedClass5(str: String) {
        init {
            println(str)
        }
    }
}

fun main(args: Array<String>) {
    val nestedClass5: OuterClass5.NestedClass5 = OuterClass5().NestedClass5("hello world")
}