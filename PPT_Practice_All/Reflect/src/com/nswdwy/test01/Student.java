package com.nswdwy.test01;

/**
 * @author yycstart
 * @create 2020-08-19 11:07
 */
public class Student {
    private String name;
    private int grade;
    private double score;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }
    private void play(String content,int times){
        System.out.println("玩["+ content +"],玩了["+ times +"]次");
    }
}
