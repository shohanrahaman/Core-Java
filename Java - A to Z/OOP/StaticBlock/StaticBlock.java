package com.shohan.oop.StaticBlock;

/**
 *
 * @author SHOHAN
 */
public class StaticBlock {

    static {
        //Static block executive before main method
        System.out.println("I am Static Block");

    }

    public static void main(String[] args) {
        System.out.println("I am Main Method");
    }
}
