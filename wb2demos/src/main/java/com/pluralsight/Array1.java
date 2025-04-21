package com.pluralsight;

public class Array1 {

    public static void main(String [] args){
        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        //           0     1   2  3   4   5   6   7
        // length = 8

        for (int i = 0; i < nums.length; i++){
            System.out.printf(nums[i] + " ");
        }
        System.out.println();

        String[] strings = {"one", "two", "orange", "red", "left", "right"};
        for (int i = 0; i < strings.length; i++){
            String thestring = strings[i];
            System.out.println("The length of the string is " + thestring.length());
            System.out.printf(strings[i]+ " ");
        }
        String name = "some name";
        System.out.println(name.length());
    }
}
