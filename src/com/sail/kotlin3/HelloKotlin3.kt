package com.sail.kotlin3

/**
 *
 * @author yangfan
 * @date 2018/12/24
 */
class Person(var name: String, var age: Int) {

    private val str: String = "Person属性"

    /**
     * 内部类会持有一个外部类的引用，可以访问到外部类的成员变量
     */
    private inner class PersonFeature(var height: Int, var weight: Int) {

        private val str: String = "PersonFeature属性"

        fun getPersonFeature() {

            val str: String = "局部属性"

            println("身高：$height, 体重：$weight")

            println(this@Person.str)
            println(this.str)
            println(str)

            this@Person.method()
        }

    }

    private fun method() {
        println("执行了Person的method方法")
    }

    fun getPerson() {
        var personFeature = PersonFeature(120, 180)
        personFeature.getPersonFeature()
    }
}

fun main(args: Array<String>) {
    var person = Person("zhangsan", 20)
    person.getPerson()

}
