package com.shohan.oop.methodOverriding;

/**
 *
 * @author SHOHAN
 */
public class Teacher extends Person {

    String qualification;

    @Override
    public void display() { //Already present in super class & one interface multiple implementation
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Qualification : " + qualification);
    }
}
