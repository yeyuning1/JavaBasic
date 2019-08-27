package control;

import java.util.Scanner;

public class judge {
    //    public static void main(String[] args) {
//        int n = 59;
//        if (n > 90) {
//            System.out.println("优秀");
//        } else if (n > 70) {
//            System.out.println("良好");
//        } else if (n >= 60) {
//            System.out.println("及格");
//        }else{
//            System.out.println("挂科");
//        }
//        System.out.println("END");
//    }
//    public static void main(String[] args) {
//        double x = 1 - 9.0 / 10;
//        if (Math.abs(x - 0.1) < 0.00001) {
//            System.out.println("x is 0.1");
//        } else {
//            System.out.println("x is NOT 0.1");
//        }
//    }
//    public static void main(String[] args) {
//        String s1 = "hello";
////        String s1 = null;
//        String s2 = "HELLO".toLowerCase();
//        System.out.println(s1);
//        System.out.println(s2);
//        if (s1 != null && s1.equals(s2)) {
//            System.out.println("s1 equals s2");
//        } else {
//            System.out.println("s1 not equals s2");
//        }
//    }
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入你的身高：");
            float high = scanner.nextFloat();
            System.out.print("请输入你的体重：");
            float weight = scanner.nextFloat();
            float bmi = weight / (high * high);
            if (bmi < 18.5) {
                System.out.println("过轻");
            } else if (bmi < 25) {
                System.out.println("正常");
            } else if (bmi < 28) {
                System.out.println("过重");
            } else if (bmi < 32) {
                System.out.println("肥胖");
            } else {
                System.out.println("高于32");
            }
        }
    }
}

