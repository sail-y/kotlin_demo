package com.sail.kotlin3

/**
 * 嵌套类（Nested Class）
 *
 * @author yangfan
 * @date 2018/12/24
 */
class OuterClass {
    private val str: String = "hello world"

    /**
     * 嵌套类就相当于Java里的静态内部类，所以他不能访问外部类的成员变量
     */
    class NestedClass {
        fun nestedMethod() = "welcome"
    }

    /**
     * 可以访问另外一个嵌套类，相当于Java中静态类访问静态类
     */
    class NestedClass2 {
        val nestedClass = NestedClass()
    }
}

fun main(args: Array<String>) {
    println(OuterClass.NestedClass().nestedMethod())
}