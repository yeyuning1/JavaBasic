package control;

public class dw {
    //    public static void main(String[] args) {
//        int sum = 0;
//        int n = 1;
//        do {
//            sum = sum + n;
//            n++;
//        } while (n <= 100);
//        System.out.printf("结果是 %d", sum);
//    }
    public static void main(String[] args) {
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用do while计算M+...+N:
        do {
            sum = sum + m + n;
            m++;
        } while (m <= n);
        System.out.println(sum);
    }
}
