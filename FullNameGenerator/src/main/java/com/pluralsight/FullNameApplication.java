package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);


        // prompt the user
        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstname = scanner.nextLine();

        System.out.print("Middle name: ");
        String middlename = scanner.nextLine();

        System.out.print("Last name: ");
        String lastname = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        // compute the unknown
        String fullName = firstname + " " + middlename + " " + lastname + " , " + suffix;

        System.out.println("Full name: "+ fullName);













    }
}