package com.perscholas.java_basics;

import java.util.Formatter;

public class JavaBasicsClass {
    public static void main(String[] args) {

        // 1. Sum of two integers
        int int1 = 10;
        int int2 = 20;
        int sumInt = int1 + int2;
        System.out.println("Sum of integers: " + sumInt);

        // 2. Sum of two doubles
        double d1 = 15.5;
        double d2 = 25.5;
        double sumDouble = d1 + d2;
        System.out.println("Sum of doubles: " + sumDouble);

        // 3. Sum of integer and double (Sum must be a double)
        int intVar = 5;
        double doubleVar = 10.5;
        double mixedSum = intVar + doubleVar;
        System.out.println("Mixed sum: " + mixedSum);

        // 4. Division of two integers
        int smallInt = 10;
        int largeInt = 50;
        int divResult = largeInt / smallInt;
        System.out.println("Integer division: " + divResult);
        // Note: If you change the larger number to a decimal, you must change
        // the variable type to double to avoid a compiler error.

        // 5. Division of two doubles and casting
        double doubleDiv1 = 50.0;
        double doubleDiv2 = 7.0;
        double divDoubleResult = doubleDiv1 / doubleDiv2;
        System.out.println("Double division: " + divDoubleResult);
        int castedResult = (int) divDoubleResult;
        System.out.println("Casted result: " + castedResult);

        // 6. x, y, and q
        int x = 5;
        int y = 6;
        double q = y / x; // Integer division happens first here (result 1.0)
        System.out.println("q (integer division): " + q);
        q = (double) y / x; // Casting y to double allows decimal division
        System.out.println("q (with casting): " + q);

        // 7. Named constant
        final double PI = 3.14159;
        double circleArea = PI * 10 * 10;
        System.out.println("Area using constant: " + circleArea);

        // 8. Cafe Scenario
        double coffeePrice = 3.50;
        double espressoPrice = 4.25;
        double greenTeaPrice = 2.75;

        double subtotal = (3 * coffeePrice) + (4 * espressoPrice) + (2 * greenTeaPrice);
        final double SALES_TAX = 0.08; // 8% tax
        double totalSale = subtotal + (subtotal * SALES_TAX);

        // Formatting to 2 decimal places
        System.out.printf("Cafe Subtotal: $%.2f%n", subtotal);
        System.out.printf("Cafe Total Sale (with tax): $%.2f%n", totalSale);
    }
}