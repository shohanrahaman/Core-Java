package com.shohan.method_overloading;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        Overload ov = new Overload();
        ov.add(10, 20);
        ov.add(10.5, 15.6);
        ov.add(10, 20, 30);
        ov.add();
    }

}
