//Question 3: Power of Two
//Write a program that takes an integer as input and returns true if the input is a power of two.

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //get user input from keyboard
        System.out.println("Enter an integer: ");
        int num = keyboard.nextInt(); //read integer and store it in variable num

        boolean isPowerOfTwo = false; // flag to track if  a number is a power of two
        while (num % 2 == 0) { //loop to che check if num is divisible by 2 repeatedly
            num = num / 2;  //divide num by 2 and store result in num
        }
        if (num == 1) { //all divisions were successful
            isPowerOfTwo = true;  //set isPowerOfTwo to true
        }
        if (isPowerOfTwo) {
            System.out.println("true"); // the integer is a power of two
        } else {
            System.out.println("false"); // the integer is not a power of two
        }
    }
}
