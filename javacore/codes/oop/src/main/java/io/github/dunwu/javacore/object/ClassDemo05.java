package io.github.dunwu.javacore.object;

public class ClassDemo05 {
    public static void main(String[] args) {
        // 创建对象
        Person person1 = new Person();
        Person person2 = new Person();

        // 给类的属性赋值
        person1.name = "张三";
        person1.age = 30;
        person2.name = "李四";
        person2.age = 33;

        // 把person1的堆内存空间使用权给person2
        person2 = person1;
        System.out.print("person1对象中的内容 --> ");
        person1.tell();
        System.out.print("person2对象中的内容 --> ");
        person2.tell();
    }
};
