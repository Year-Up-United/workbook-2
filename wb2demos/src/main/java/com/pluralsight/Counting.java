package com.pluralsight;

public class Counting {
    public static void main(String[] args) throws InterruptedException{

    }

    {

        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 10);

        System.out.println("i= " + i);
        System.out.println("Sum = " + sum);
        System.out.println();

        Thread.sleep(1000);

        i++;
        System.out.println("--------------------");
        System.out.println("Sum= " + sum);



    }
}
