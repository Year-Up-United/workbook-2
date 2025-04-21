package com.pluralsight;

public class Main {
    public static void main(String[] args) {
       Dice dice = new Dice();

       int roll1;
       int roll2;
       int numOf2 = 0;
       int numOf4 = 0;
       int numOf6 = 0;
       int numOf7 = 0;

       for(int rollNumber = 0; rollNumber <= 100 ; rollNumber++){
          roll1 = dice.roll();
          roll2 = dice.roll();
          int rollTotal = roll1 + roll2;
          System.out.printf("Roll #%d: %d - %d  Sum: %d\n", rollNumber, roll1, roll2, rollTotal);

       }

    }
}