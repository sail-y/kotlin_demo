package com.sail.kotlin2

import kotlin.test.assertTrue

/**
 *
 * @author yangfan
 * @date 2018/12/04
 */
class ParameterizedClass<A>(private val value: A) {

    fun getValue(): A {
        return this.value
    }
}

class ParameterizedProducer<out T>(private val value: T) {

    fun get(): T {
        return this.value
    }
}

class ParameterizedConsumer<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}


fun main(args: Array<String>) {
    val parameterizedClass = ParameterizedClass<String>("hello world")

    var result = parameterizedClass.getValue()

    assertTrue(result is String)

    println("--------")

    val parameterizedProducer = ParameterizedProducer("welcome")
    var myRef: ParameterizedProducer<Any> = parameterizedProducer

    // List<String> list = new ArrayList<>();
    // List<? extends Object> list2 = list;

    assertTrue(myRef is ParameterizedProducer<Any>)


    println("--------")

    val parameterizedConsumer = ParameterizedConsumer<Number>()
    var myRef2:ParameterizedConsumer<Int> = parameterizedConsumer
    // List<Object> list = new ArrayList<>();
    // List<? super String> list2 = list;

    assertTrue(myRef2 is ParameterizedConsumer<Int>)

}