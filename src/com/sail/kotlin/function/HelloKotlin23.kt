package com.sail.kotlin.function

/**
 * 扩展：extension
 * @author yangfan
 * @date 2017/12/05
 */

class ExtensionTest {
    fun add(a: Int, b: Int) = a + b;

    fun subtract(a: Int, b: Int) = a - b;
}

// 扩展方法
fun ExtensionTest.multiply(a: Int, b: Int) = a * b


fun main(args: Array<String>) {
    var extensionTest = ExtensionTest();

    println(extensionTest.add(1, 2))
    println(extensionTest.subtract(1, 2))
    println(extensionTest.multiply(1, 2))
}

// 扩展函数的解析是静态的
// 它本质上没有修改ExtensionTest的字节码，通过了一些特定的方式让它的对象可以调用这个方法。

// 1. 扩展本身并不会真正修改目标类，也就是说它并不会在目标类中插入新的属性或是方法。
// 2. 扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型。
// 3. 调用是由对象声明类型所决定的，而不是对象的实际类型所决定的。
// 4. 扩展属性无法重写类已经有的方法。

