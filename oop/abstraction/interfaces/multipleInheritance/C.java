package com.shohan.abstraction.interfaces.multipleInheritance;

/**
 *
 * @author SHOHAN
 */
public class C implements A, B {

    @Override
    public void play() {
        System.out.println("Hello , i am from C");
    }

}
