//Question 6: Count Vowels
//Write a program that counts the number of vowels in a sentence.

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        int vowelCount = 0; //counter
        Scanner keyboard = new Scanner(System.in); //keyboard input
        System.out.println("Enter a sentence");
        String sentence = keyboard.nextLine(); //get a sentence from keyboard input
        sentence = sentence.toLowerCase(); //convert the sentence to lower case
        for (int i = 0; i < sentence.length(); ++i) {
            //check for a,e,i,o,u in the sentence.
            char letter = sentence.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++; //increment vowel count by 1
            }
        }
        System.out.println(vowelCount); //print the number of vowels
    }
}
