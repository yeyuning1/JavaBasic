package basic;

public class chars {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '中';
        int n1 = 'A';
        int n2 = '中';
        // 注意是十六进制:
        char c3 = '\u0041'; // 'A'，因为十六进制0041 = 十进制65
        char c4 = '\u4e2d'; // '中'，因为十六进制4e2d = 十进制20013

    }
}
