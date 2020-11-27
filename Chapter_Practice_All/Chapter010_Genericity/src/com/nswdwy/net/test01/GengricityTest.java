package com.nswdwy.net.test01;

import java.util.Objects;

/**
 * @author yycstart
 * @create 2020-08-14 15:28
 */
public class GengricityTest {
    public static void main(String[] args) {
        Person<Integer> p1 = new Person<>("Tom", 13);
        Person<String> p2 = new Person<String>("孙悟空","五行大山压不住你");
        Person<Boolean> p3 = new Person<>("猪悟能", true);
        Person<Character> p4 = new Person<>("沙悟净", '男');

    }
}

class Person<X>{
    private String name ;
    private X other;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public X getOther() {
        return other;
    }

    public void setOther(X other) {
        this.other = other;
    }

    public Person(String name, X other) {
        this.name = name;
        this.other = other;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", other=" + other +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person<?> person = (Person<?>) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(other, person.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, other);
    }
}