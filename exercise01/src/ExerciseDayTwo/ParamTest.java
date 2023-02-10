package ExerciseDayTwo;
public class ParamTest {
    public static void main (String[] args){
        Person person = new Person();
        person.change(person);
        int age = person.age;
        System.out.println(age);
        int i = 10;
        person.change2(i);
        System.out.println(i);
    }
}
class Person{
    int age;
    public void change (Person person){
        person.age = 30;
    }
    public void change2 (int age){
        age = 40;
    }
}
