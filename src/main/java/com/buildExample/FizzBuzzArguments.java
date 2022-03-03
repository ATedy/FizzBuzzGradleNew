package com.buildExample;

public class FizzBuzzArguments {

  public static void main(String[] args) {
    fizzBuzzArguments(300, 100);

  }
  private static void fizzBuzzArguments(int a, int b) {
    int fizzCount = 0, buzzCount = 0, fizzBuzzCount = 0;
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
