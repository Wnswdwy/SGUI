/**
 * @author yycstart
 * @create 2020-07-24 19:54
 *
 * 1. 定义类 Test13
 * 2. 定义 main方法
 * 3. 定义一个int类型变量a,变量b,都赋值为20.
 * 4. 定义boolean类型变量bo , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo
 * 5. 输出a的值,bo的值. 6. 定义boolean类型变量bo2 ,
 * 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
 * 7. 输出b的值,bo2的值.
 */
public class Test13 {
    public static void main(String[] args) {
        int a=20,b=20;
        boolean bo = true;
        boolean bo2 = true;
        bo = (++a % 3 ==0 );
        System.out.println("a的值为："+ a);
        System.out.println("bo的值为："+ bo);
        bo2 = (b++%3==0)&&(++b%7==0);
        System.out.println("b的值为："+ b);
        System.out.println("bo2的值为："+ bo2);

    }
}
