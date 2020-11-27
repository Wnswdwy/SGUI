/**
 * @author yycstart
 * @create 2020-07-31 18:11
 */
public class Test01 {
    public static void main(String[] args) {
        Person tes = new Person();
        System.out.println("age =" + tes.age);
        Person tes1 = new Person(12);
        tes1.setName("Tom");
        System.out.println("Name= " + tes1.getName());
    }
}
class Person{
    int age;
    private String name;
    Person(){
        age = 18;
        System.out.println("age = " + age);
    }
    Person(int inAge){
        age = inAge;
        System.out.println("age = " + age);
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
