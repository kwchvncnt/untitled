package com.company;

import java.util.Scanner;


public class Task_1_6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type 4 digits: ");
        int[] value = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int first, second, third, fourth;
        for (int state : value) {
            fourth = state % 10;
            first = state / 1000;
            second = (state / 100) % 10;
            third = (state / 10) % 10;
            if (second == (first + third) / 2) {
                System.out.println(second);
            } else if (first == (second + third) / 2) {
                System.out.println(first);
            } else if (third == (second + fourth) / 2) {
                System.out.println(third);
            } else if (fourth == (second + third) / 2) {
                System.out.println(fourth);
            }
        }
    }
}
