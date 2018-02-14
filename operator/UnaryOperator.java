package com.shohan.operator;

/**
 *
 * @author SHOHAN
 */
public class UnaryOperator {

    public static void main(String[] args) {
        int x = 20;
        System.out.println(x++); //20(21) 
        System.out.println(++x); //22
        System.out.println(x--); //22(21)
        System.out.println(--x); //20
    }
}
