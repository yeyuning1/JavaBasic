package basic;

public class Floats {
    public static void main(String[] args) {
//        double x = 1.0 / 10;
//        double y = 1 - 9.0 / 10;
//        System.out.println(x);
//        System.out.println(y);

//        int n = 5;
//        double d = 1.2 + 24 / n; // 6.0
//        System.out.println(d);

//        double d = 2.6;
//        int n = (int) (d + 0.5);
//        System.out.println(n);
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;

        double r1 ;
        double r2 ;
        r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        System.out.println(r1);
        System.out.println(r2);
    }
}