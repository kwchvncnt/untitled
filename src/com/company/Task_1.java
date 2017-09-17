package com.company;

import java.util.Random;
import java.util.Scanner;

//user greetings
public class Task_1 {
    public static void main(String[] args) {
        Scanner un = new Scanner(System.in);
        System.out.print("Hello! Please type tour name here:");
        String user_name = un.next();
        System.out.println("Hello " + user_name);
    }
}


