// 变量、变量作用域和变量的命名规则
/*
 * 命名规则：
 * 变量：首字母小写和驼峰规则 lastName
 * 方法名：首字母小写和驼峰规则 getData()
 * 常量：大写字母的下划线 MAX_VALUE
 * 类名：首字母大写和驼峰规则 Person
 */
public class Demo07 {
    /*
     * 类变量
     */
    static double salary = 2500;

    /*
     * 实例变量：从属于对象；如果不自行初始化，则这个类型为默认值 整数为 0，浮点数为 0.0
     * 布尔值的默认值为 false
     * 除了基本类型，其余的默认值都为 null
     */
    String name;
    int age;

    // main 方法
    public static void main(String[] args) {
        // 局部变量：必须声明和初始化
        int i = 10;
        System.out.println(i);

        // 实例变量
        Demo07 demo07 = new Demo07();
        System.out.println(demo07.name);
        System.out.println(demo07.age);

        // 类变量 static
        System.out.println(salary);
    }

    // 其他方法
    public void add () {

    }
}
