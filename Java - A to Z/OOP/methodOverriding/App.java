package com.shohan.oop.methodOverriding;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Rahaman";
        t.age = 30;
        t.qualification = "MBA";
        t.display();
    }
}
