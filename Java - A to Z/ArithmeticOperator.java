package com.shohan;

/**
 *
 * @author SHOHAN
 */
public class ArithmeticOperator {

    public static void main(String[] args) {

        // a+b=7 [+,= Operator | a,b Operand | 7 Constant | a+b=7 Expression]
        // Arithmetic Operator : + - * / %
        int num1, num2, result;
        num1 = 22;
        num2 = 11;

        result = num1 + num2;
        System.out.println("Sum : " + result);
        result = num1 - num2;
        System.out.println("Sub : " + result);
        result = num1 * num2;
        System.out.println("Multiplication : " + result);
        result = num1 / num2;
        System.out.println("Divide : " + result);
        result = num1 % num2;
        System.out.println("Remainder : " + result);

    }
}
