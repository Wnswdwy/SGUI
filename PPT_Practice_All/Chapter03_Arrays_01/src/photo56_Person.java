import javax.sound.midi.Soundbank;

/**
 * @author yycstart
 * @create 2020-07-29 14:08
 *
 * (1)创建Person类的对象，设置该对象的name、age和sex属性，
 * 调用study方法，输出字符串“studying”，调用showAge()方法显示age值，
 * 调用addAge()方法给对象的age属性值增加2岁。
 * (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 */
public class photo56_Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 15;
        person.name = "aa";
        person.showAge(16);
        int ages = person.addAge(18);
        System.out.println(ages);
    }
}
class Person{
    int age = 0;
    String name = "xx";
    char sex = '男';
    public void study(){
        System.out.println("studying");
    }
    public void showAge(int age){
        System.out.println("年龄为：" + age);
    }
    public int addAge(int age){
        age += 2;
        return age;
    }
}