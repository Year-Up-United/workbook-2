package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the person's full name: ");
        String fullName = scanner.nextLine();

        System.out.println("What is the person's age: ");
        int age = scanner.nextInt();

        // clear the CRLF
        scanner.nextLine();

        System.out.println("What is the person's profession: ");
        String profession = scanner.nextLine();

        displayPerson(fullName, age, profession);
        savePerson(fullName, age, profession);
        
        System.out.printf("Person %s is %s and is %d years old.", fullName, profession, age);
    }

    private static void displayPerson(String fullName, int age, String profession) {


    }
    public static void savePerson(String fullname, int age, String profession) {

    }




    }
