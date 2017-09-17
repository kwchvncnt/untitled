package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner un = new Scanner(System.in);//user greetings
        System.out.print("Hello! Please type tour name here:");
        String user_name = un.next();

        System.out.println("Hello " + user_name);
    }

}

