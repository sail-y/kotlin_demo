package com.sail.kotlin.class2

import kotlin.test.assertTrue

/**
 * 在Kotlin中：Consumer in，Producer out
 * @author yangfan
 * @date 2018/01/28
 */
class ParameterizedClass<A>(private val value: A) {

    fun getValue(): A {
        return this.value
    }
}

// 协变 producer
class ParameterizedProducer<out T>(private val value: T) {
    fun get(): T {
        return this.value
    }
}
// 逆变 consumer
class ParameterizedConsumer<in T>{
    fun toString(value: T): String {
        return value.toString();
    }
}
fun main(args: Array<String>) {
    val parameterizedClass = ParameterizedClass<String>("hello world")
    var result = parameterizedClass.getValue()

    assertTrue(result is String)

    println("--------")


    val parameterizedProducer = ParameterizedProducer("welcome")
    // 协变，相当于 ? extends Object
    var myRef:ParameterizedProducer<Any> = parameterizedProducer
    assertTrue(myRef is ParameterizedProducer<Any>)

    // List<String> list = new ArrayList();



    // 逆变
    val parameterizedConsumer = ParameterizedConsumer<Number>()
    val myRef2: ParameterizedConsumer<Int> = parameterizedConsumer;

    // List<Object> list = new ArrayList();
    // List<? super String> list2 = list;

    assertTrue(myRef2 is ParameterizedConsumer<Int>)

}