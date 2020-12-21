package com.udacity.jdnd.course1.service;

public class FizzBuzzService {

    /**
     * If number is divisible by 3, return "Fizz". If divisible by 5,
     * return "Buzz", and if divisible by both, return "FizzBuzz". Otherwise,
     * return the number itself.
     *
     * @Throws IllegalArgumentException for values < 1
     */
    public String fizzBuzz(int number) {
        String returnString = "";
        if(number < 0){
            throw new IllegalArgumentException();
        }
        if (number%3==0){
            returnString = "Fizz";
        }
        if (number%5==0){
            returnString += "Buzz";
        }

        if(returnString.length() < 1){
            returnString = Integer.toString(number);
        }
        return returnString;
    }
}
