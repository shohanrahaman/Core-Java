package com.shohan.array;

import java.util.Scanner;

/**
 *
 * @author SHOHAN
 */
public class ArraySum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;

        System.out.print("Enter 5 number : ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        
        for (int i = 0; i < number.length; i++) {
            sum = sum+number[i];
        }
        System.out.println("sum is : "+sum);
    }
}
