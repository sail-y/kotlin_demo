package com.sail.kotlin.base

/**
 *
 * @author yangfan
 * @date 2017/10/27
 */
fun main(args: Array<String>) {
    println(convert2Uppercase(123))


}

fun convert2Uppercase(str: Any): String? {
    if (str is String) {
        return str.toUpperCase()
    }

    return null
}