package com.sail.kotlin2



/**
 * 密封类（sealed class）
 *
 * 密封类是抽象的
 *
 * 密封类可以认为是枚举类的一种扩展，是用来描述一种类的层次结构
 *
 * @author yangfan
 * @date 2018/11/17
 */
sealed class Caculator

class Add : Caculator()

class Subtract : Caculator()

// 会导致下面的when编译报错，因为没有列举所有的实现，或者提供else实现
// class Multiply: Caculator()

// when必须列举所有的实现，否则需要加上else语句
fun calculate(a: Int, b: Int, cal: Caculator) = when (cal) {
    is Add -> a + b
    is Subtract -> a - b
}

fun main(args: Array<String>) {
    println(calculate(1, 2, Add()))
    println(calculate(1, 2, Subtract()))
}