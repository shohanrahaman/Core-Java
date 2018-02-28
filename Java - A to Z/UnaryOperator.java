package com.shohan;

/**
 *
 * @author SHOHAN
 */
public class UnaryOperator {

    public static void main(String[] args) {
        //Unary Operator : + - 
        int x, result;
        x = 10;

        result = +x;
        System.out.println("Result : " + result);
        result = -x;
        System.out.println("Result : " + result);

        /*
         increment operator :
         ++x; //increments  by one - Before it used
         x++; //increments  by one - After it used
         decrement operator :
         --x; //decrements  by one - Before it used
         x--; //decrements  by one - After it used
         */
        int a, b;
        a = 25;

        b = ++a; //pre increment
        System.out.println("b = " + b);
        b = --a; //pre decrement
        System.out.println("b = " + b);
        b = a++; //post increment
        System.out.println("b = " + b);
    }
}
