package com.company;

import java.util.Scanner;

public class Task_1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type 4 digits: ");
        int[] a = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        for (int state : a) {
            if (state % 2 == 0) {
                System.out.println("this value is even: " + state);
                System.out.println();
            }
        }
        for (int state2 : a) {
            if (state2 % 2 != 0) {
                System.out.println("This value is odd: " + state2);
            }
        }
    }
}





