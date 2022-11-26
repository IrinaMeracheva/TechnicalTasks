package com.company;

import java.util.Scanner;

public class CountOddEvenZeroNumbers {

    private static final int NUMBER_SIZE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter %d integer numbers!%n", NUMBER_SIZE);
        int numbers = NUMBER_SIZE;

        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        int i = 1;
        while (i <= numbers) {
            int currentNumber;
            System.out.printf("Enter %d number: ", i);
            try {
                currentNumber = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("This was not an integer. Please enter a valid integer!");
                continue;
            }
            if (currentNumber == 0) {
                zeroCount++;
            }else if (currentNumber % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }
            i++;
        }
        System.out.printf("Number of odd numbers: %d%nNumber of even numbers: %d%nNumber of 0s: %d", oddCount,
                evenCount, zeroCount);
    }
}
