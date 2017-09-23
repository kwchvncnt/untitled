package com.company;

import java.util.Scanner;

public class Task_1_6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type 4 digits(value should have 3 digits, each digit should be unique): ");
        int[] value = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int first, second, third;
        for (int state : value) {
            if (state > 99 && state < 1000) {
                third = state % 10;
                first = state / 100;
                second = ((state - third) % 100) / 10;
                if (first != second & first != third & second != third) {
                    System.out.println(state);
                }
            }
        }
    }
}
