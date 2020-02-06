package Basics.Assignment1a;

public class Assignment1a {
    //Create a program that calculates and outputs the first 20
    // numbers in the sequence on a single line
    public static void main(String[] args) {

        //make all the variables

        int num = 19;
        int firstNumber = 1;
        int nextNumber = 1;

        //Message Display
        System.out.print("The first 20 numbers in the sequence are: " + firstNumber + " ");

        //using for loop to iterate the numbers

        for (int i = 1; i <= num; i++) {
            int sum = firstNumber + nextNumber;
            firstNumber = nextNumber;
            nextNumber = sum;

            System.out.print(firstNumber + " ");


        }


    }
   }
