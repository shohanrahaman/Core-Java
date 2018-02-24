package com.shohan.method_overriding;

/**
 *
 * @author SHOHAN
 */
public class Teacher extends Person {

    String qualification;

    @Override
    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Qualification : " + qualification);
    }
}
