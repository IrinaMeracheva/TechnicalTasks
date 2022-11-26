package com.company;

import java.util.Scanner;

public class CountOddEvenZero {

    private static final int NUMBERS_SIZE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[NUMBERS_SIZE];
        System.out.printf("Please enter %d numbers on a single line, separated by a space:", NUMBERS_SIZE);
        String[] numbersAsString = scanner.nextLine().split(" ");
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
            if (numbers[i] == 0) {
                zeroCount++;
            }else if (numbers[i] % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.printf("Number of odd numbers: %d%nNumber of even numbers: %d%nNumber of 0s: %d", oddCount,
                evenCount, zeroCount);
    }
}

