package com.kuang.base;

// 基本类型拓展
public class Demo04 {
    public static void main(String[] args) {
        // ====================================
        // 整数拓展 二进制、八进制、十进制、十六进制
        // ====================================
        int i1 = 10;
        int i2 = 010; // 八进制10
        int i3 = 0x10; // 十六进制10

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("===============================");

        // ====================================
        // 浮点数拓展 银行业务怎么表示？钱
        // BigDecimal 数学工具类
        // ====================================
        // 最好完全避免浮点数进行比较！
        // 最好完全避免浮点数进行比较！
        // 最好完全避免浮点数进行比较！
        float f = 0.1F;
        double d = 1.0 / 10;

        System.out.println(f == d); // false
        System.out.println(f);
        System.out.println(d);

        float f1 = 2312313123123123123f;
        float f2 = f1 + 1;

        System.out.println(f1 == f2); // true
        System.out.println("===============================");

        // ====================================
        // 字符拓展
        // ====================================
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1); // 强制转换
        System.out.println(c2);
        System.out.println((int)c2); // 强制转换
        System.out.println("===============================");
        // 所有的字符本质还是数字

        // 编码 Unicode 表：(97 = a, 65 = A) 2字节 0 - 65535 (U0000 - UFFFF)
        char c3 = '\u0061';
        System.out.println(c3); // a
        System.out.println("===============================");

        // 转义字符
        // \t 制表符
        // \n 换行符
        System.out.println("Hello\tworld!");
        System.out.println("===============================");

        // ====================================
        // 字符串扩展
        // ====================================
        String sa = new String("Hello world!");
        String sb = new String("Hello world!");
        System.out.println(sa == sb); // false

        String sc = "Hello world!";
        String sd = "Hello world!";
        System.out.println(sc == sd); // true

        System.out.println("===============================");

        // ====================================
        // 布尔值拓展
        // ====================================
        boolean flag = true;
        // if (flag == true) {} // 新手
        if (flag) {} // 老手
    }
}
