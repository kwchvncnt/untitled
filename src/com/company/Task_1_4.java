package com.company;

import java.util.Objects;
import java.util.Scanner;
//compare password input with example
public class Task_1_4 {
    public static void main(String[] args) {
        String example = "Password123";
        Scanner pass = new Scanner(System.in);
        System.out.print("Please type your password: ");
        for (String pass_input = pass.next();;) {
            if (example.equals(pass_input)) {
                System.out.println("Welcome!");
                break;
            } else {
                System.out.print("Try again:");
                pass_input = pass.next();
            }
        }
    }
}
