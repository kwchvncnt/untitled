package com.company;

import java.util.Scanner;

public class Task_1_6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type 4 digits: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int fourth = input.nextInt();
        if (first > second & first > third & first > fourth) {
            System.out.println("This is the max: " + first);
        } else if (second > first & second > third & second > fourth) {
            System.out.println("This is the max: " + second);
        } else if (third > first & third > second & third > fourth) {
            System.out.println("This is the max: " + third);
        } else if (fourth > first & fourth > second & third < fourth) {
            System.out.println("This is the max: " + fourth);
        }
        System.out.println();
        if (first < second & first < third & first < fourth) {
            System.out.println("This is the min: " + first);
        } else if (second < first & second < third & second < fourth) {
            System.out.println("This is the min: " + second);
        } else if (third < first & third < second & third < fourth) {
            System.out.println("This is the min: " + third);
        } else if (fourth < first & fourth < second & third > fourth) {
            System.out.println("This is the min: " + fourth);
        }
    }
}