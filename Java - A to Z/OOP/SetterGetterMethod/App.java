package com.shohan.oop.SetterGetterMethod;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Rahaman");
        p.setAge(70);
        System.out.println("Name : " + p.getName());
        System.out.println("Age : " + p.getAge());
    }
}
