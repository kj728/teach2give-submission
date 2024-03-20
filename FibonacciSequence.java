//Question 2: Fibonacci Sequence
//Write a program to generate the Fibonacci sequence up to 100.

public class FibonacciSequence {

    public static void main(String[] args) {

        int firstNum = 0;  //initalize variables
        int secondNum = 1;
        int nextNum = 0;
        System.out.println("Fibonacci numbers that are below 100");
        System.out.println();
        while (nextNum <= 100) {
            System.out.print(nextNum + ", ");
            nextNum = firstNum + secondNum; // calculate next value
            firstNum = secondNum; //assign secondNum to firstNum
            secondNum = nextNum; // assign nextNum  to secondNum
        }
        System.out.println();
    }
}
