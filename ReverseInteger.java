//Question 5: Reverse Integer
//Write a program that takes an integer as input and returns an integer with reversed digit
//ordering

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //keyboard input
        System.out.println("Enter a number");
        int inputNum = keyboard.nextInt(); //read a number from keyboard input
        int reversedNum = 0; // stores the reversed number
        for (; inputNum != 0; ) { //loop until inputNum becomes zero
            int remainder = inputNum % 10; //extract last digit using modulus
            // build reversed number by multiplying the reversedNum by ten to shift digits to the left
            //add the last digit the remainder to the end
            reversedNum = reversedNum * 10 + remainder;
            inputNum = inputNum / 10; //remove the last digit from inputNum
        }
        System.out.println("Reversed number: " + reversedNum); //print the reversed num
    }
}
