package Basics.CountCharacters;

//to access a particular letter in a string to say the number of letters in a string
//Program that will count the number of occurrences
//of a particular letter in a given string.

import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {
        //Ask the user to enter a string and a character

        Scanner s = new Scanner(System.in);
        //make an array of characters to contain the modified alphabeth
        char[] oldAlphabeth = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        char[] newAlphabeth = {'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U'};
        //char[] newAlphabeth = new char[26];
        //don't do this, if you dont have to
        //newAlphabeth[0] = "N";
        //newAlphabeth[1]= "O"

        System.out.print("Enter a string: ");
        String str = s.nextLine();

        System.out.print("Enter a letter: ");
        String input = s.nextLine();

        char ch = input.charAt(0);

        //Loop to go thru every letter in the str,
        int count = 0;                   //variable to hold the count
        for (int i=0; i<str.length(); i++){
            if (ch== str.charAt(i)) {
                count++;
            }

        }
        System.out.println("There are " + count + " '" + ch + "'s in " + str);
        //To tell java you want a character, put the character in front
        System.out.println("'A' is now '" + (char)('A' + 13) + "'");
    }

}
