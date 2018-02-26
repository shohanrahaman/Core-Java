package com.shohan.encapsulation;

/**
 *
 * @author SHOHAN
 */
public class App {

    public static void main(String[] args) {
        EncapTest et = new EncapTest();
        et.setName("shohan rahaman");
        et.setAge(70);
        System.out.println(et.getName());
        System.out.println(et.getAge());
    }
}
