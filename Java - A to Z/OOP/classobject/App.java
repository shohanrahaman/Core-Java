package com.shohan.oop.classobject;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        Teacher t = new Teacher(); //Any class type variable called object
        t.name = "Shohan Rahman";
        t.age = 50;
        t.phone = "01711111111";

        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.phone);

    }
}
