package io.github.dunwu.javacore.object;

public class ClassDemo04 {
    public static void main(String[] args) {
        // 创建对象
        Person person1 = new Person();
        Person person2 = person1;

        // 给类的属性赋值
        person1.name = "张三";
        person1.age = 30;
        // 设置person2对象的内容，实际上就是设置person1对象的内容
        person2.name = "李四";
        person2.age = 33;

        // 调用类的方法
        System.out.print("person1对象中的内容 --> ");
        person1.tell();
        System.out.print("person2对象中的内容 --> ");
        person2.tell();
    }
};
