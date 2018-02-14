package com.shohan.operator;

/**
 *
 * @author SHOHAN
 */
public class LogicalBitwiseOperator {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 20;
        //logical && operator doesn't check second condition if first condition is false. It checks second condition only if first one is true.
        System.out.println(x < y && x > z); //false && true = false
        //bitwise & operator always checks both conditions
        System.out.println(x < y & x > z); //false && true = false
        //Logical || and Bitwise |
        System.out.println(x > y || x < z);//true || true = true  
        System.out.println(x > y | x < z);//true | true = true  
    }
}
