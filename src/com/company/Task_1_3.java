package com.company;

import java.util.Random;

//output for random digits with fixed amount
public class Task_1_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(99999);
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(value);
            value = rand.nextInt();
        }
//without redirection to the next line
        Random rand1 = new Random();
        int value1 = rand1.nextInt(99999);
        for (int counter = 1; counter <= 10; counter++) {
            System.out.print(value1 + "; ");
            value1 = rand1.nextInt();
        }
    }
}