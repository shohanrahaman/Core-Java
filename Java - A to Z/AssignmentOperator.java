package com.shohan;

/**
 *
 * @author SHOHAN
 */
public class AssignmentOperator {

    public static void main(String[] args) {
        //Asignment Operator : = += -= *= /= %=
        //Ex : x+=5 | x = x+5;

        int x = 3;
        int y = 2;

        x += y; //x = x+y = 5
        System.out.println("x = " + x);
        x -= y; //x = x-y = 3
        System.out.println("x = " + x);
        x *= y; //x = x*y = 6
        System.out.println("x = " + x);
        x /= y; //x = x/y = 3
        System.out.println("x = " + x);
        x %= y; //x = x%y = 1
        System.out.println("x = " + x);
    }
}
