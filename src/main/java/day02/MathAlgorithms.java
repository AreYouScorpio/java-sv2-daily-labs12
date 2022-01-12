package day02;

public class MathAlgorithms {

    public static void main(String[] args) {
        System.out.println(eucl(20,10));
    }

        public static int eucl( int a, int b){
        //int a=18;
        //int b=9;
        int m = 1;
        if (b > a) {
            m = b;
            b = a;
            a = m;
            m = 1;
        }
        while (m > 0) {
            m = a % b;
            if (m == 0) return b;
            a = b;
            b = m;
        }
        return -1;
    }


}
