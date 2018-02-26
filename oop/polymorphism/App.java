package com.shohan.polymorphism;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
        
        p = new Teacher();
        p.display();
        
        p = new Student();
        p.display();
    }
}
