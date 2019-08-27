package basic;

public class Arrays {

    public static void main(String[] args) {
//        int[] ns = new int[5];
//        ns[0] = 1;
//        ns[1] = 2;
//        ns[2] = 3;
//        ns[4] = 4;
////        System.out.println(ns.length);
//        System.out.println(ns[4]);

//        int[] ns = new int[]{68, 79, 91, 85, 62};
//        int[] ns = {68, 79, 91, 85, 62};
//        System.out.println(ns.length);
        String[] names = {
                "ABC", "XYZ", "zoo"
        };
        String s = names[1];
        names[1] = "123";
        System.out.println(s);
    }
}
