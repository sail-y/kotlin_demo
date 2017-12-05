package com.sail.kotlin.function

/**
 * 伴生对象的扩展
 * @author yangfan
 * @date 2017/12/05
 */
class CompanionObjectExtension {
    companion object MyObject{

    }
}

fun CompanionObjectExtension.MyObject.method(): Unit {
    println("hello world")
}

fun main(args: Array<String>) {
    CompanionObjectExtension.method()
}