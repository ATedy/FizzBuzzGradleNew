package com.buildExample;

public class FizzBuzz {

  public static void main(String[] args) {
    System.out.println(fizzBuzz(8));
    System.out.println(fizzBuzz(15));
    System.out.println(fizzBuzz(9));
    System.out.println(fizzBuzz(10));
  }

  private static String fizzBuzz(int num) {
    if (num % 15== 0) {
      return "FizzBuzz";
    }
    if (num % 3 == 0) {
      return "Fizz";
    } else if (num % 5 == 0) {
      return "Buzz";
    } else {
      //changing int to string
      return String.valueOf(num);
    }
  }

}
