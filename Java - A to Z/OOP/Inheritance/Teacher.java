package com.shohan.oop.Inheritance;

/**
 *
 * @author SHOHAN
 */
public class Teacher extends Person {

    String qualification;

    public void display2() {
        display1();
        System.out.println("Qualification : " + qualification);
    }
}
