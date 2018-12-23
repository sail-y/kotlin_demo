package com.sail.kotlin2

/**
 *
 * @author yangfan
 * @date 2018/12/23
 */
class MyStorage<out T>(private var t: T) {
    fun getValue(): T {
        return t
    }


    fun setValue(t: @UnsafeVariance T) {
        this.t = t
    }
}

fun main(args: Array<String>) {
    var myStorage1: MyStorage<Int> = MyStorage(5)
    var myStorage2: MyStorage<Any> = myStorage1

    println(myStorage2.getValue())

    myStorage2.setValue("hello") // 泛型擦除

    println(myStorage2.getValue())


}