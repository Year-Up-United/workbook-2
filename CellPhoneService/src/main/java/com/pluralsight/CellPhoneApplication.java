package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {

        // input scanner
        Scanner scanner = new Scanner(System.in);

        // add variables
        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        CellPhone phone = new CellPhone();

        // ask the questions
        System.out.println("What is the serial  number? ");
        // scanner
        serialNumber = scanner.nextInt();

        // clear out
        scanner.nextLine();

        System.out.println("What model is the phone? ");
        // scanner
        model = scanner.nextLine();

        System.out.println("Who is the carrier? ");
        // scanner
        carrier = scanner.nextLine();

        System.out.println("What is the phone number? ");
        // scanner
        phoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone? ");
        // scanner
        owner = scanner.nextLine();

    System.out.println(phone.getSerialNumber());
    System.out.println(phone.getModel());
    System.out.println(phone.getCarrier());
    System.out.println(phone.getOwner());
    }
}