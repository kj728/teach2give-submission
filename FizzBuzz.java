//Question 1: FizzBuzz
//Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for
//multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print
//"FizzBuzz".

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            double fizzResult = i % 3; //stores remainder after division by 3
            double buzzResult = i % 5; //stores remainder after division by 5
            if (buzzResult == 0.0 && fizzResult == 0.0) { // number is divisible by both 3 and 5
                System.out.println("FizzBuzz"); //form multiples of both 3 and 5
            } else if (fizzResult == 0.0) { //number is divisible by 3
                System.out.println("Fizz"); //for multiples of 3
            } else if (buzzResult == 0.0) { // number is divisible by 5
                System.out.println("Buzz"); // for multiples of 5
            } else {
                System.out.println(i);
            }
        }
    }
}
