package com.shohan.exceptionHandling;

/**
 *
 * @author SHOHAN
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int result = x / y;  //Throw Exception
            System.out.println(result);

        } catch (Exception e) {  //Receive Exception
            System.out.println("Exception : " + e); //print object/variable
        } finally {
            System.out.println("Last line of the program");
        }

    }
}
