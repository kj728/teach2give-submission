//Question 4: Capitalize Words
//Write a program that accepts a string as input, capitalizes the first letter of each word in the
//string, and then returns the result string.

import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);//keyboard input
        System.out.println("Enter a sentence");
        String sentence = keyboard.nextLine(); //read a sentence from keyboard input
        String sentenceWords[] = sentence.split("\\s"); //split the sentence into words
        String capitalizedWordSentence = ""; // stores the final string
        for (String word : sentenceWords) {
            String firstCharacter = word.substring(0, 1); //gets the first character of the word
            String otherCharacters = word.substring(1); //stores all the other characters except the first
            //capitalize firstCharacter and concatenate with otherCharacters and a space
            //then append  the result to capitalizedSentence which stores the final string
            capitalizedWordSentence += firstCharacter.toUpperCase() + otherCharacters + " ";
        }
        System.out.printf("Result: " + capitalizedWordSentence); //print the sentence
    }
}
