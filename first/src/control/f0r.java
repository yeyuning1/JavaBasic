package control;

public class f0r {
    //    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
//    }
    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25};
        int sum = 0;
        for (int i = 0; i < ns.length; i++) {
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            sum = sum + ns[i];
        }
        System.out.println("sum = " + sum);
    }
}
