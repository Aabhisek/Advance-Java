package com.abhi.prep.java_advance.interview;

public final class Student {
    private final String name;
    private final int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Student student1=new Student("abhisek",112);
        String name=student1.getName();
        System.out.println(name);
        String uname=name.toUpperCase();
        System.out.println(uname);
        System.out.println(name);

    }

}
