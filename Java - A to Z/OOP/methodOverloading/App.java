package com.shohan.oop.methodOverloading;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.add();
        mo.add(15, 25);
        mo.add(5.6, 10.8);
        mo.add(6, 8, 12);

    }
}
