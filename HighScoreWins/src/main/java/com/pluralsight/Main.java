package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // scanner
        Scanner scanner = new Scanner(System.in);
        // greeting
        System.out.println("Hello Sports Fan!");
        // prompt the user for input
        System.out.println("Enter the game score (ex. Home:Visitor|21:9): ");
        // add scanner
        String input = scanner.nextLine();

        // split the input on the pipe "|"
        String [] parts = input.split("\\|");

        // split team names
        String[] teams = parts[0].split(":");
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        // split for scores
        String[] scores = parts[1].split(":");
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        // if statements
        if (homeScore > visitorScore){
            System.out.println("The winner is: " + homeTeam);
        } else if (visitorScore > homeScore){
            System.out.println("The winner is: " + visitorTeam);
        } else {
            System.out.println("It's a tie!");
        }







    }
}