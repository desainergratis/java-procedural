package com.codingtest;

import java.util.Scanner;

public class Main {

    static void fizzbuzzFunct(int inputData) {
        int index = 1;
        while(index <= inputData) {

            if(index % 3 == 0 && index % 5 ==0) {
                System.out.println("fizz buzz");
            } else if(index % 5 == 0) {
                System.out.println("fizz");
            } else if(index % 3 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(index);
            }

            index++;
        }
    }
    public static void main(String[] args) {
        // Fizz buzz coding chalengge
            // print value 1 until 50
        int limitValue;

        //  Using java library / class scanner to get input from user
        Scanner inputLimit = new Scanner(System.in);

        System.out.print("Input limit value : ");
        limitValue = inputLimit.nextInt();

        fizzbuzzFunct(limitValue);


    }
}