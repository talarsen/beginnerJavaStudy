package com.codewithtara;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if ( number % 3 == 0 ){
            System.out.print("Buzz");
        } else if (number % 5 == 0) {
            System.out.print("Fizz");
        } else {
            System.out.print(number);
        }

        System.out.println("You selected: "+ number);

    }
}
