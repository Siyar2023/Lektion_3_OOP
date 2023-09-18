package com.siyar.models;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student jonas = new Student("Jonas", 15);
        Student alicia = new Student("Alicia", 20);
        Student ali = new Student("Ali", 25);
        Student anders = new Student("Anders", 20);
        System.out.println("Students name is: " + jonas.name);
        System.out.println("Students age is: " + jonas.age);
        System.out.println("Students name is: " + alicia.name);
        System.out.println("Students age is: " + alicia.age);
        System.out.println("Students name is: " + ali.name);
        System.out.println("Students age is: " + ali.age);
        System.out.println("Students name is: " + anders.name);
        System.out.println("Students age is: " + anders.age);
        System.out.println(jonas.doubleMyage());

        Random randomAge = new Random();
        String[] name = {"Lisa", "Roni", "Jonas", "Ali", "Jakob"};

        for (int i = 0; i < 5; i++) {
            Student student = new Student(name[i], randomAge.nextInt(43) + 25); // Generate a random age between 25 and 67
            System.out.println(student.name + " " + student.age);
        }

    }
}