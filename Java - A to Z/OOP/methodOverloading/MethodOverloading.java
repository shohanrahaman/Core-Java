package com.shohan.oop.methodOverloading;

/**
 *
 * @author SHOHAN
 */
public class MethodOverloading {

    //Overloaded Method
    public void add() {
        System.out.println("Nothing to add");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
