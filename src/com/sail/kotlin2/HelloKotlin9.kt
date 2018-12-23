package com.sail.kotlin2

/**
 * 泛型函数
 *
 * @author yangfan
 * @date 2018/12/23
 */

fun <T> getValue(item: T): T {
    return item
}

fun main(args: Array<String>) {
    val item = getValue<Int>(3)
    println(item)

    val item2 = getValue("hello")
    println(item2)


    var upperBoundsClass = UpperBoundsClass2<String>()

}

class UpperBoundsClass<T : List<T>> {

}

class UpperBoundsClass2<T> where T : Comparable<T>, T : Any {

}
