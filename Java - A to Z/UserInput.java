package com.shohan;

import java.util.Scanner;

/**
 *
 * @author SHOHAN
 */
public class UserInput {

    public static void main(String[] args) {
        //user input using scanner 
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter any number : ");
        number = input.nextInt();
        System.out.println("Number is " + number);

    }
}
