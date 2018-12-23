package com.sail.kotlin.base

class Person constructor(username: String) {
    private var username: String

    private var age: Int

    private var address: String

    init {
        println(username)
        this.username = username
        this.age = 20
        this.address = "chengdu"
    }

    constructor(username: String, age: Int) : this(username) {
        println(username + ", " + age)


        this.age = age
    }

    constructor(username: String, age: Int, address: String) : this(username, age) {
        this.address = address
    }

    fun printlnInfo() {
        println("username: $username, age: $age, address: $address")
    }
}


fun main(args: Array<String>) {
    val person = Person("zhangsan")
    val person2 = Person("lisi", 30)
    val person3 = Person("wangwu", 40, "beijing")

    person.printlnInfo()
    person2.printlnInfo()
    person3.printlnInfo()
}

