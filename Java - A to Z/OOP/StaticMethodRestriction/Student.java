package com.shohan.oop.StaticMethodRestriction;

/**
 *
 * @author SHOHAN
 */
public class Student {

    static String name = "Static Member";

    void display1() {
        //static method can access static | non-static member
        display2(); //Access static method
        System.out.println("Name : " + name); //Access staic member
        System.out.println("I am non-static Method");
    }

    static void display2() {
        //static mehtod can't use non static member
        System.out.println("Name : " + name);
        System.out.println("I am staic method");
    }

}
