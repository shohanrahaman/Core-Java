package com.shohan.oop.instanceofOperator;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        Person p = new Person();

        System.out.println(t instanceof Teacher);
        System.out.println(p instanceof Teacher);
    }
}
