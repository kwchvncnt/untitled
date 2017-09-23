package com.company;

import java.util.Scanner;

public class Task_1_6_3_and_1_6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type 4 digits: ");
        int[] value = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        for (int state : value) {
            if (state % 3 == 0 || state % 9 == 0) {
                System.out.println("This value multiplies by 3 or 9: " + state);
            } else if (state % 5 == 0 & state % 7 == 0) {
                System.out.println("This value multiplies by 5 & 7: " + state);
            }
        }
    }
}
