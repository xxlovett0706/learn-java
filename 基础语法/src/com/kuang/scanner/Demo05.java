package com.kuang.scanner;

import java.util.Scanner;

// 输入多个数字求和，和平均数
public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0; // 总和
        int m = 0; // 个数

        while (scanner.hasNextDouble()) {
            double temp = scanner.nextDouble();
            m += 1; // m++
            sum += temp;

            System.out.println("你输入的第" + m + "个数据，为" + temp);
        }
        System.out.println(m + "个数据，总和为" + sum);
        System.out.println(m + "个数据，平均数为" + sum / m);

        scanner.close();
    }
}
