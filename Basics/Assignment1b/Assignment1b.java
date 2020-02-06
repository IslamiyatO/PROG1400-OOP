package Basics.Assignment1b;

public class Assignment1b {

    //Create a program that takes a single word in lowercase letters, stored as a constant
    //variable, and outputs it as a ROT13 encrypted version.
    public static void main(String[] args) {

        //make an array of characters to contain the modified alphabeth
        char[] oldAlphabeth = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
        char[] newAlphabeth = {'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        //Ask the user to enter a word/string

       // Scanner s = new Scanner(System.in);
       // System.out.print("Enter a word: ");
        String name = "secret";
        //String str = s.nextLine();
        //To display message before the output
        System.out.print( '"' + name + '"' + " would be encrypted to  '");


        //Loop to go thru every letter in the str,
        int count = 0;                     //variable to hold the count
        for (int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if       (ch >= 'a' && ch <= 'm') ch += 13;
            else if  (ch >= 'n' && ch <= 'z') ch -= 13;
            System.out.print(ch);

        }

        System.out.print( '"');
    }

}
