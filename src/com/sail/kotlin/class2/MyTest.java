package com.sail.kotlin.class2;

import java.util.ArrayList;
import java.util.List;

/**
 * Java中的协变和逆变
 * @author yangfan
 * @date 2018/01/28
 */
public class MyTest {
    public static void main(String[] args) {
        /*
        List<String> list = new ArrayList<>();
        // Java中不允许直接赋值，因为List<String>不是List<Object>的一个子类型
        List<Object> list2 = list;

        // 假设上面的代码成立，下面的代码也无法正常运行
        list2.add(3);
        String str = list2.get(0);
         */

        // 协变， 生产者 Extends
        /*
        List<Cat> cats = new ArrayList<>();
        // animals是生产者，不能添加数据
        List<? extends Animal> animals = cats;
        // animals.add(new Cat()); compile error
        // 可以获取
        Animal animal = animals.get(0);
        */

        // 逆变， 消费者 Super

        List<Animal> animals = new ArrayList<>();
        List<? super Animal> contravariantAnimals = animals;

        // 执行成功
        // List<Object> objects = new ArrayList<>();
        // contravariantAnimals = objects;

        contravariantAnimals.add(new Cat());
        contravariantAnimals.add(new Dog());

        // 只能Animal的父类来接收
        // Animal animal = contravariantAnimals.get(0); compile error

        // 数组天然支持协变
        Object[] objects = new String[]{"hello", "world"};
        objects[0] = new Object(); // exception



    }
}

class Animal {

}

class Cat extends Animal {

}

class Dog extends Animal {

}
