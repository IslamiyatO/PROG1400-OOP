package OOP.Doubles;

import java.util.Scanner;

public class DoublesGame {

    // create function.. remove the static from psv because a new class is already created
    public  void run() {
        //create two variables
        Die die1 = new Die();
        Die die2 = new Die();
        //player starts with $100
        int money = 100;
//to create random numbers

        Scanner Scanner = new Scanner(System.in);
        String input;

        System.out.println("The game Begins!");
        do{
            //create random numbers to roll the dice
            die1.roll();
            die2.roll();

            System.out.println("You rolled a " + die1.value);
            System.out.println("and a " + die2.value);

            //shot doubles!
            if (die1.value ==die2.value) {
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
                System.out.println("Play again?y/n");
                input = Scanner.nextLine();
            }else{
                System.out.println("you have lost all your money.");
                input = "n";
            }


        }while(input.equals("y"));

        System.out.println("The Game Ends...");

    }

}
