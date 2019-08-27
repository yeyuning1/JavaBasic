package control;

public class output {
    //    public static void main(String[] args){
//        System.out.print("A,");
//        System.out.print("B,");
//        System.out.print("C.");
//        System.out.println();
//        System.out.println("END");
//    }
//    public static void main(String[] args) {
//        double d = 12900000;
//        System.out.println(d); // 1.29E7
//    }
//    public static void main(String[] args) {
//        double d = 3.1415926;
//        System.out.printf("%.2f\n", d); // 显示两位小数3.14
//        System.out.printf("%.4f\n", d); // 显示4位小数3.1416
//    }
    public static void main(String[] args) {
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
    }
}
