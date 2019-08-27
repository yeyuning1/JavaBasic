package control;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
//        System.out.print("Input your name: "); // 打印提示
//        String name = scanner.nextLine(); // 读取一行输入并获取字符串
//        System.out.print("Input your age: "); // 打印提示
//        int age = scanner.nextInt(); // 读取一行输入并获取整数
//        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入上次成绩");
        float grades1 = scanner.nextInt();
        System.out.println("请输入本成绩");
        float grades2 = scanner.nextInt();
        float promote = (grades2 - grades1) / grades1 * 100;
        System.out.printf("成绩提高了 %.2f %%", promote);

    }
}
