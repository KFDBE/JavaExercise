package exercise;

public class Control {
    public static void main(String[] args){

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        //条件运算符
        int e = a < b ? c : d ;
        System.out.println(e);

        //if控制语句
        if (a < b){
            System.out.println("exit");
        }

        //if else控制语句
        if (a > b){
            System.out.println("1");
        }
        else {
            System.out.println(b);
        }

        //if else if  else控制语句
        if (a > b){
            System.out.println("1");
        }
        else if(a == b){
            System.out.println(b);
        }
        else {
            System.out.println(b);
        }


        //swith语句
        switch(a){

            case 1:
                System.out.println("a == 1");
                break;

            case 2:
                System.out.println("a == 2");
                break;

            case 3:
                System.out.println("a == 3");
                break;

            default:
                System.out.println("default");

        }


    }
}
