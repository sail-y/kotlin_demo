package com.sail.kotlin.base

/**
 *
 * @author yangfan
 * @date 2017/11/25
 */
open class Fruit {
    open fun name() {
        println("fruit")
    }

    fun expirationDate() {
        println("1 month")
    }

}

class Apple: Fruit() {
    override fun name() {
        println("apple")
    }
}


open class Orange: Fruit() {
   final override fun name() {
        println("orange")
    }
}



fun main(args: Array<String>) {
    var apple = Apple()
    apple.name()
    apple.expirationDate()
}
