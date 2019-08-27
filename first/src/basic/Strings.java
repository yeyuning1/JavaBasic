package basic;


public class Strings {
    //    public static void main(String[] args){
//        String s = ""; // 空字符串，包含0个字符
//        String s1 = "A"; // 包含一个字符
//        String s2 = "ABC"; // 包含3个字符
//        String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格
//        String s4 = "ABC\n\u4e2d\u6587"; // 包含6个字符: A, B, C, 换行符, 中, 文
//    }
    public static void main(String[] args) {
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world"?
    }
}
