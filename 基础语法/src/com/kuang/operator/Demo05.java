package com.kuang.operator;

// 自增、自减运算符
public class Demo05 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++;
        int c = ++a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
