package com.shohan.oop.StaticMethodRestriction;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        Student s = new Student();
        s.display1();

        Student.display2();
    }
}
