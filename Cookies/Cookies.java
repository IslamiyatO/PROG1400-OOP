package Cookies;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cookies {
    //A bag of cookies holds 40 cookies.
    //The calorie information on the bag claims
    //that there are 10 servings in the bag and that a serving equals 300 calories.
    //Write a program that lets the user enter the
    //number of cookies he or she actually ate and
    //then reports the number of total calories consumed.

    public static void main(String[] args) {
        int cookiesInABag = 40;
        int servingsInBag = 10;
        int servingCalories = 300;



        // make a new variable called scanner and use it to get input from the user
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        //    user enters number of cookies eaten
        // to get the variable
        System.out.print("How many cookies did you eat? ");
        int numCookies = s.nextInt();

        //    output calories consumed
        // create variable to hold number of servings
        int servingSize = cookiesInABag / servingsInBag;
        float userServings = (float)numCookies / servingSize;
        //    calculate the number of calories
        float userCalories =  userServings * servingCalories;

        System.out.println(name + ", you ate " + userCalories + " calories.");
        
    }
}
