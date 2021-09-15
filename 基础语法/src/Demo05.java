// 类型转换
// byte, short, char -> int -> long -> float -> double
public class Demo05 {
    public static void main(String[] args) {
        // 强制类型转换
        int i1 = 128;
        byte b1 = (byte)i1; // 内存溢出

        System.out.println(i1);
        System.out.println(b1);

        // 自动类型转换
        int i2 = 128;
        double d2 = i2;

        System.out.println(i2);
        System.out.println(d2);

        /*
        * 注意点：
        * 1. 不能对布尔值进行转换
        * 2. 不能把对象类型转换为不相干的类型
        * 3. 在把高容量转为低容量的时候，要强制转换
        * 4. 转换的时候可能存在内存溢出，或者精度丢失的问题
        * */

        System.out.println("=====================");

        System.out.println((int)23.8); // 23
        System.out.println((int)-45.8); // -45

        System.out.println("=====================");

        char c = 'a';
        int i = c + 1;

        System.out.println(i);
        System.out.println((char)i);
    }
}
