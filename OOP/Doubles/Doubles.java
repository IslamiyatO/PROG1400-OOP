package OOP.Doubles;

import java.util.Random;
import java.util.Scanner;

public class Doubles {

    // create function
    public static void runGame() {
        //create two variables
        int die1;
        int die2;
        //player starts with $100
        int money = 100;
//to create random numbers
        Random random = new Random();
        Scanner Scanner = new Scanner(System.in);
        String input;

        System.out.println("The game Begins!");
        do{
            //create random numbers to roll the dice
            die1 = random.nextInt(  6) + 1;
            die2 = random.nextInt( 6) + 1;

            System.out.println("You rolled a " + die1);
            System.out.println("and a " + die2);

            //shot doubles!
            if (die1 ==die2) {
                System.out.println("You WIN!");
                //double the money
                money *= 2;
            }else {
                // lose $20, if doubles
                System.out.println("You have lose $20");
                money -= 20;
            }
            //
            if  (money > 0){
                System.out.println("You have $" + money);
                System.out.println("Play agsin?y/n");
                input = Scanner.nextLine();
            }else{
                System.out.println("you have lost all your money.");
                input = "n";
            }


        }while(input.equals("y"));

        System.out.println("The Game Ends...");
    }
    public static void main(String[] args) {
        runGame();
    }

    }
