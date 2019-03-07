package io.github.dunwu.javacore.object;

class Person {
    // 人中有姓名和年龄两个属性
    String name; // 表示姓名
    int age; // 表示年龄

    void tell() {
        System.out.println("姓名：" + name + "；年龄：" + age);
    }

    public static void main(String[] args) {
        Person per = new Person();
        per.tell();
    }
};
