package com.shohan.oop.Static;

/**
 *
 * @author SHOHAN
 */
public class Student {

    public String name;
    public int id;
    //static keyword is used for memory management [Save Memory].
    public static String universityName = "Dhaka University"; //static | class variable

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {

        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("University Name : " + universityName);

    }
}
