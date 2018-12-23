package com.sail.kotlin.base

/**
 *
 * @author yangfan
 * @date 2017/12/05
 */

class MyExtensionProperty

val MyExtensionProperty.name: String
    get() = "hello"

fun main(args: Array<String>) {
    var myExtensionProperty = MyExtensionProperty()
    println(myExtensionProperty.name)
}