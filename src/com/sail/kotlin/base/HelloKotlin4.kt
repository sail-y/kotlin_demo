package com.sail.kotlin.base

/**
 *
 * @author yangfan
 * @date 2017/10/12
 */
fun main(args: Array<String>) {
    println(convert2Int("23"))
    println(convert2Int("ab"))

    printMultiply("2", "3")
    printMultiply("2", "B")
}

fun convert2Int(str: String): Int? {
    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        return null
    }
}

fun printMultiply(a: String, b: String) {
    var a2Int = convert2Int(a)
    var b2Int = convert2Int(b)


    if (null != a2Int && null != b2Int) {
        println(a2Int * b2Int)
    } else {
        println("param not int")
    }
}

fun printMultiply2(a: String, b: String) {
    var a2Int = convert2Int(a)
    var b2Int = convert2Int(b)


    println(a2Int!! * b2Int!!)

}