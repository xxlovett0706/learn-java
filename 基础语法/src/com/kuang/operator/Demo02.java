package com.kuang.operator;

// 加法运算符 两类型相加至少是 int 类型
public class Demo02 {
    public static void main(String[] args) {
        long a = 123123123123L;
        int b = 123;
        short c = 123;
        byte d = 8;

        System.out.println(a + b + c + d); // long
        System.out.println(b + c + d); // int
        System.out.println(c + d); // int
    }
}
