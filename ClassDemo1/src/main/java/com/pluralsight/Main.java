package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fullname;
        int age;
        String profession;

        System.out.println("What is the person's full name: ");
        fullname = scanner.nextLine();

        System.out.println("What is the person's age: ");
        age = scanner.nextInt();

        // clear the CRLF
        scanner.nextLine();

        System.out.println("What is the person's profession: ");
        profession = scanner.nextLine();

        // create a person
        Person thePerson = new Person(fullname, age, profession);

        System.out.println("What is the person's full name: ");
        fullname = scanner.nextLine();

        System.out.println("What is the person's age: ");
        age = scanner.nextInt();

        // clear the CRLF
        scanner.nextLine();

        System.out.println("What is the person's profession: ");
        profession = scanner.nextLine();

        // create other person
        Person theOtherPerson = new Person(fullname, age, profession);
        // print the person name
        System.out.println(thePerson.getFullname());
        System.out.println(theOtherPerson.getFullname());
       // displayPerson(fullName, age, profession);
       // savePerson(fullName, age, profession);
        
        System.out.printf("Person %s is %s and is %d years old.\n"
                , thePerson.getFullname()
                , thePerson.getProfession()
                , thePerson.getAge());
    }

    private static void displayPerson(String fullName, int age, String profession) {


    }
    public static void savePerson(String fullname, int age, String profession) {

    }




    }
