package exercise;

class One {
    int age = 20;

    public void change(One one) {
        one.age = 30;
    }
}

public class membervariable {

    public static void main (String[] args){
        One one = new One();
        int age = one.age;
        System.out.println(age);
        one.change(one);
        int age2 = one.age;
        System.out.println(age2);
    }


}
