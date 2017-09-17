package com.company;

import java.util.Random;
//output for random digits with fixed amount
public class Task_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(99999);
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(value);
            value = rand.nextInt();
        }
    }
}
