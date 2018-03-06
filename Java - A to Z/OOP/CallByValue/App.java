package com.shohan.oop.CallByValue;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        CallByValue cv = new CallByValue();
        int x = 10; //primitive data [stack memory]
        System.out.println("x before call : " + x);

        cv.change(x); //Actual parameter [Original value doesn't change]
        System.out.println("x after call : " + x);

    }
}
