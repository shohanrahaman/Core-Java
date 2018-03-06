package com.shohan.oop.CallByReference;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        CallByReference r1 = new CallByReference();
        r1.name = "Shohan";
        System.out.println("Before calling : " + r1.name);

        r1.change(r1); //Original value gets change
        System.out.println("After calling : " + r1.name);
    }
}
