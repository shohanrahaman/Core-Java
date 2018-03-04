package com.shohan.oop.ParametrizedConstructor;

/**
 *
 * @author SHOHAN
 */
public class Teacher {

    public String name, phone;
    public int age;

    //Parametrized Constructor
    Teacher(String n, int a, String p) {
        name = n;
        age = a;
        phone = p;

    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone : " + phone);
    }
}
