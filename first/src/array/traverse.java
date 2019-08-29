package array;

public class traverse {
    public static void main(String[] args) {
        int[] ns = {1, 2, 3, 4, 5};
        for (int i = ns.length - 1; i >= 0; i--) {
            int n = ns[i];
            System.out.println(n);
        }
//        for (int i = 0; i < ns.length; i++) {
//            int n = ns[i];
//            System.out.println(n);
//        }
//        for (int n : ns) {
//            System.out.printf(n + ",");
    }
}

