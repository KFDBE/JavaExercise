package exercise;

public class operator {
    public static void main(String[] args){

        int a = 1;
        int b = 2;

        //运算符
        int c =  a + b;
        int d =  a - b;
        int e =  a * b;
        double f = a / b;
        System.out.println(c);
        System.out.println(e);
        System.out.println(d);
        System.out.println(f);

        //关系运算符
        int a1 = 3;
        int b1 = 2;

        boolean c1 = ( a1 > b1 );
        System.out.println(c1);

        //逻辑运算符
        int a2 = 1;
        int b2 = 2;
        int c2 = 3;
        int d2 = 4;
        int f2 = 5;

        boolean e2  = ( a2 < b2 ) && ( c2 < d2 );
        System.out.println(e2);

        boolean e3 = (a2<b2)||(c2<d2);
        System.out.println(e3);

        boolean e4 = (a > b)||((f = c) < d);
        System.out.println(e4);
        System.out.println(f2);



    }
}
