package com.nswdwy.test02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author yycstart
 * @create 2020-08-12 16:31
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom",25,3000);
        Employee employee2 = new Employee("Bob",22,4000);
        Employee employee3 = new Employee("Tom",25,3000);

        Set set = new HashSet();

        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        for(Object temp: set){
            System.out.print(temp + " ");
        }
    }
}

class Employee{
    private String name;
    private int age;
    private double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
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

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}