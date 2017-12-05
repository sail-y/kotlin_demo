package com.sail.kotlin.function

import java.util.*

/**
 * 扩展的作用域
 * 1. 扩展函数所定义在的类实例叫做分发接收者（dispatch receiver）
 * 2. 扩展函数所扩展的那个类的实例叫做扩展接收者（extension receiver）
 * 3. 当以上两个名字出现冲突时，扩展接收者的优先级更高
 *
 * @author yangfan
 * @date 2017/12/05
 */

// 扩展接收者
class DD {
    fun method() {

    }
}

// 分发接收者
class EE {
    fun method2() {

    }

    fun DD.hello() {
        method()
        method2()
    }

    fun world(dd: DD) {
        dd.hello()
    }

    fun DD.output() {
        println(toString())
        println(this@EE.toString())
    }

    fun test() {
        var dd = DD()
        dd.output()
    }
}

fun main(args: Array<String>) {
   EE().test()
}

// 扩展可以很好地解决Java中充斥的各种辅助类问题。
// Collections.swap(list, 4, 10)
// list.swap(4, 10)
// Collection.binarySearch()
// list.binarySearch()



