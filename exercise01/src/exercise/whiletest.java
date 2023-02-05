package exercise;

public class whiletest {
    public static void main(String[] args){

        int a = 1;
        int sum = 0;

        while(a <= 100){
            a++;
            sum += a;
        }
        System.out.println(sum);

        do{
            sum += a;
            ++a;
        }while (a <= 100);
        System.out.println(sum);

        //for
        int swm = 0;
        for(int w = 1 ; w <= 100 ; w++){
            swm += w;
        }
        System.out.println(swm);

    }
}
