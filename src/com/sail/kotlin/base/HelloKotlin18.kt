package com.sail.kotlin.base

/**
 * 抽象类
 * @author yangfan
 * @date 2017/11/28
 */
open class BaseClass {

    open fun method() {

    }
}

abstract class ChildClass: BaseClass() {
    override abstract fun method()
}