package com.sail.kotlin3

/**
 * 如何在外面创建嵌套类的对象
 *
 * @author yangfan
 * @date 2019/03/20
 */
class OuterClass4 {
    class NestedClass4() {
        init {
            println("NestedClass4构造快执行")
        }
    }
}

fun main(args: Array<String>) {
    val nestedClass4: OuterClass4.NestedClass4 = OuterClass4.NestedClass4()
}