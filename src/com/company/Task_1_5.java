package com.company;

import java.util.Scanner;

public class Task_1_5 {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.println("Please type 4 digits: ");
        int first = digit.nextInt();
        int second = digit.nextInt();
        int third = digit.nextInt();
        int fourth = digit.nextInt();
        int sum = first + second +third + fourth;
        System.out.print("SUM = " + sum + "; ");
        System.out.println("(MULT = " + first * second * third * fourth + ")");
    }
}
