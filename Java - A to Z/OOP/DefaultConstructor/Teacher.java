package com.shohan.oop.DefaultConstructor;

/**
 *
 * @author SHOHAN
 */
public class Teacher {

    public String name, phone;
    public int age;

    //Default Constructor;
    Teacher() {

    }

    public void displayInfo() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone : " + phone);
    }
}
