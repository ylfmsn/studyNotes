package io.github.dunwu.javacore.access;

import static io.github.dunwu.javacore.access.Operate.add;
import static io.github.dunwu.javacore.access.Operate.div;
import static io.github.dunwu.javacore.access.Operate.mul;
import static io.github.dunwu.javacore.access.Operate.sub;

public class StaticImportDemo {
    public static void main(String[] args) {
        System.out.println("3 + 3 = " + add(3, 3)); // 直接调用静态方法
        System.out.println("3 - 2 = " + sub(3, 2)); // 直接调用静态方法
        System.out.println("3 * 3 = " + mul(3, 3)); // 直接调用静态方法
        System.out.println("3 / 3 = " + div(3, 3)); // 直接调用静态方法
    }
};
