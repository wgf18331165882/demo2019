package com.wgf.demo;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 11);
        Person p2 = new Person("李四", 12);
        Person p3 = new Person("王五", 13);
        Person[] arr={p1,p2,p3};
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
