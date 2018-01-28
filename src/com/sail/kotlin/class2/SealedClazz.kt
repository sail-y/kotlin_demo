package com.sail.kotlin.class2

/*
    密封类（sealed class）

    密封类是抽象的
 */

sealed class Caculator

class Add : Caculator()

class Subtract : Caculator()

// when必须列举所有的实现，否则需要加上else语句
fun calculate(a: Int, b: Int, cal: Caculator) = when (cal) {
    is Add -> a + b
    is Subtract -> a - b
}

fun main(args: Array<String>) {
    println(calculate(1, 2, Add()))
    println(calculate(1, 2, Subtract()))
}