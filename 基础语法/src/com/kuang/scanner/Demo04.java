package com.kuang.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        float f = 0.0F;

        System.out.println("请输入整数：");

        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("输入的整数是：" + i);
        } else {
            System.out.println("输入的不是整数");
        }

        System.out.println("请输入浮点数：");

        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("输入的浮点数是：" + f);
        } else {
            System.out.println("输入的不是浮点数");
        }

        scanner.close();

    }
}
