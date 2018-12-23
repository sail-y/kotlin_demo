package com.sail.kotlin.base

/**
 *
 * @author yangfan
 * @date 2017/11/25
 */
open class MyParent {
    open val name: String = "parent"
}

class MyChild: MyParent() {
    override val name: String = "child"
}

fun main(args: Array<String>) {
    var myChild = MyChild()

    println(myChild.name)

    println("----")

    var myChild3 = MyChild3()

    myChild3.method()
    println(myChild3.name)

}


// 1. val 可以 override val
// 2. var 可以 override val
// 3. val 无法override var

class MyChild2(override val name:String) : MyParent() {

}

open class MyParent3() {
    open fun method() {
        println("parent menthod")
    }

    open val name: String get() = "parent"
}

class MyChild3: MyParent3() {
    override fun method() {
        super.method()

        println("child method")
    }

    override val name: String
        get() = super.name + " and child"
}