package com.shohan.oop.Recursion;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        Factorial f = new Factorial();
        int result = f.fact(5);
        System.out.println("Factorial of 5 : " + result);
    }
}
