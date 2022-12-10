package com.palindrome;
import java.util.Scanner;

public class Main {
      static void palindromeFunction(String userInput) {
        for(int index = 0; index < userInput.length() / 2; index++) {
           
                if( userInput.charAt(index) != userInput.charAt((userInput.length() - 1) - index) ){
                    System.out.println(userInput + " Is not a palindrome");
                    break;
                } else {
                      System.out.println(userInput + " Is a palindrome");
                }

        }
    }
    public static void main(String[] args) {
        String userInput;

        // Using java library / class to get input from user
        Scanner wordInput = new Scanner(System.in);

        System.out.print("Input words : ");
        userInput = wordInput.next();

        palindromeFunction(userInput);
        
    }
}