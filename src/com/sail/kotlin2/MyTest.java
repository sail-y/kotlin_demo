package com.sail.kotlin2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangfan
 * @date 2018/12/04
 */
public class MyTest {
    public static void main(String[] args) {
        /*
        List<String> list = new ArrayList<>();

        // 在Java中List<String>不是List<Object>的子类型，所以下面的代码无法编译通过
        List<Object> list2 = list;
        list2.add(2);
        String str = list2.get(0);
        */

        /*
        List<Cat> cats = new ArrayList<>();
        List<? extends Animal> animals = cats;

        // 其实这就是协变，他是生产者，只能读取，不能写入
//        animals.add(new Cat());   // 编译通过？
//        animals.add(new Dog());   // 编译通过？
        */

        /*
        List<Animal> animals = new ArrayList<>();
        List<? super Animal> contravariantAnimals = animals;

//        List<Object> list = new ArrayList<>();
//        contravariantAnimals = list;

        //这是逆变，是消费者，只能写入，不能读取

        contravariantAnimals.add(new Cat());
        contravariantAnimals.add(new Dog());

        // 编译出错
        Animal animal = contravariantAnimals.get(0);
        */

        // 在Java中，数组有天然的协变，但是这个协变是有问题的
        Object[] objs = new String[]{"hello", "world"};
        // java.lang.ArrayStoreException: java.lang.Object
        objs[0] = new Object();


    }
}

class Animal {

}

class Cat extends Animal {

}

class Dog extends Animal {

}
