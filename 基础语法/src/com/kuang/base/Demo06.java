package com.kuang.base;

// 类型转换补充
public class Demo06 {
    public static void main(String[] args) {
        // 操作比较大的数，要注意溢出问题
        // JDK7 新特性，数字可以用下划线分割，便于观察位数
        int money = 1_000_000_000;
        int years = 20;
        int total1 = money * years; // -1474836480 计算结果溢出
        long total2 = money * years; // 保存之前已经是 int 类型，问题已经存在了
        long total3 = (long)money * years; // 先把其中一个转换为 long 类型

        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
    }
}
