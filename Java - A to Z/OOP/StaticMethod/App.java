package com.shohan.oop.StaticMethod;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        //For static method
        Student s = new Student();
        s.display1();

        //For non-static method
        Student.display2();
    }
}
