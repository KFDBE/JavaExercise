package exercise;

class Text{
    //两个整数相加
    public int add(int a,int b){
        return a + b;
    }
    //两个整数相-
    public int  subtract(int a,int b){
        return a - b;
    }
    //两个整数相乘
    public int  multiply(int a,int b){
        return a * b;
    }
    //两个整数相除
    public int  divide(int a,int b){
        return a / b;
    }
}

public class encapsulate {
    public static void main (String[] args){
        Text text = new Text();
        int x = 1;
        int y = 2;
        int a = text.add(x,y);
        int b = text.divide(x,y);
        System.out.println(a);
        System.out.println(b);
    }
}
