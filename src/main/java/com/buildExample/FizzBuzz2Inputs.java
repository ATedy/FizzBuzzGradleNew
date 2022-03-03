package com.buildExample;

import java.util.Scanner;

public class FizzBuzz2Inputs {



  public static void fizzBuzzInputs() {

    int fizzCount = 0, buzzCount = 0, fizzBuzzCount = 0;

    // getting input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a = sc.nextInt();

        System.out.println("Enter second Number:");
        int b = sc.nextInt();

    int smaller = Math.min(a, b);
    int bigger = Math.max(a, b);

    while (smaller < bigger) {
      if (smaller % 3 == 0 && smaller % 5 == 0) {
        fizzBuzzCount++;
      } else if (smaller % 3 == 0) {
        fizzCount++;
      } else if (smaller % 5 == 0) {
        buzzCount++;
      }

      smaller++;
    }
    System.out.println("Fizz: " + fizzCount + "\n" + "Buzz: " + buzzCount + "\n" + "FIzzBuzz: " + fizzBuzzCount);
  }


}