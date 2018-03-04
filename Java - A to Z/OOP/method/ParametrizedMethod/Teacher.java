package com.shohan.oop.method.ParametrizedMethod;

/**
 *
 * @author SHOHAN
 */
public class Teacher {

    public String name, phone;
    public int age;

    //Parametrized Method
    public void setInfo(String n, int a, String p) {
        name = n;
        phone = p;
        age = a;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone : " + phone);
    }
}
