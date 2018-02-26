package com.shohan.oop.inheritance;

/**
 *
 * @author SHOHAN
 */
public class Teacher extends Person {

    String qualification;

    void displayInfo2() {
        displayInfo();
        System.out.println("Qualification : " + qualification);

    }
}
