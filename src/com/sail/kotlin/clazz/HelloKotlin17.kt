package com.sail.kotlin.clazz

/**
 * 一个类同时实现接口和类
 * @author yangfan
 * @date 2017/11/28
 */
interface A {
    fun method() {
        println("A")
    }
}

open class B {
    open fun method() {
        println("B")
    }
}

class C : A,B() {
    override fun method() {
        super<A>.method()
        super<B>.method()
        println("C")
    }
}

fun main(args: Array<String>) {
    var c = C()

    c.method()
}

