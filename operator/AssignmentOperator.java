package com.shohan.operator;

/**
 *
 * @author SHOHAN
 */
public class AssignmentOperator {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a += b; //a = a+b 
        System.out.println(a);
        a -= b; //a = a-b  
        System.out.println(a);
        a *= b; //a = a*b  
        System.out.println(a);
        a /= b; //a = a/b
        System.out.println(a);
        a %= b; //a = a%b
        System.out.println(a);
    }
}
