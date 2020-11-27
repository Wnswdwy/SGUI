package com.nswdwy.net.test01;

import java.util.*;

/**
 * @author yycstart
 * @create 2020-08-14 9:30
 *
 * // 写一个类Employee, name, age, salary.
 * // 创建TreeSet, 再创建同个Employee对象, 添加到TreeSet中.
 */
public class test01 {
    public static void main(String[] args) {
        MyComparetor myComparetor = new MyComparetor();
        Employee employee1 = new Employee("Tom1",12,1000);
        Employee employee2 = new Employee("Tom2",10,3000);
        Employee employee3 = new Employee("Tom3",11,2000);
        Employee employee4 = new Employee("Tom4",9,3000);
        Set set = new TreeSet(myComparetor);
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        for(Object temp : set){
            System.out.println(temp);
        }
        System.out.println("----------------------");
        //1)通过集合对象的iterator方法获取迭代器对象，内部游标指向第一个元素之前
            // 注意事项1）
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);

        }

    }
}
class Employee implements Comparable{
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }


    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
           int a = (int)(this.salary - ((Employee) o).getSalary());
           if(a == 0){
               a = a + 1;
            }
            return  a;
        }
   return 0;
    }
}
class MyComparetor implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Employee) || !(o2 instanceof Employee)){
            throw new RuntimeException("不匹配");
        }
        int a = ((Employee) o1).getAge() - ((Employee) o2).getAge();
        if(a == 0){
            return 1;
        }
        return a;
    }
}