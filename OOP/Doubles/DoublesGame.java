package OOP.Doubles;

import java.util.Scanner;

public class DoublesGame {

    //create two variables
   private  Die die1;
   private Die die2 ;
    //player starts with $100
   private  int money;

    public void setMoney(int money) {
        if (money >= 0) {
            this.money = money;
        } else {
            System.out.println("Error: money must be positive.");
        }
    }

        //initialize it
    public DoublesGame() {
        initialize();
        money = 100;
    }

    public DoublesGame(int money) {
        initialize();
        setMoney(money);
    }
    public void initialize() {
        die1 = new Die();
        die2 = new Die();
    }
    //create another function to roll the die
    public void rollTheDice(){
        //create random numbers to roll the dice
        die1.roll();
        die2.roll();

        System.out.println("You rolled a " + die1.getValue());
        System.out.println("and a " + die2.getValue());
    }

    //since it will be used within the
    private void checkForWin() {
        //shot doubles!
        if (die1.getValue() ==die2.getValue()) {
            System.out.println("You WIN!");
            //double the money
            setMoney (money * 2);
        }else {
            // lose $20, if doubles
            System.out.println("You have lose $20");
            setMoney (money - 20);
        }
    }

    // create function.. remove the static from psv because a new class is already created
    public  void run() {

//to create random numbers

        Scanner Scanner = new Scanner(System.in);
        String input;

        System.out.println("The game Begins!");
        do{
            rollTheDice();
            checkForWin();

            //To determine if player still has money
            if  (money > 0){
                System.out.println("You have $" + money);
                System.out.println("Play again?y/n");
                input = Scanner.nextLine();
            }else{
                //player has lost all money and must exit the game
                System.out.println("you have lost all your money.");
                input = "n";
            }

        }while(input.equals("y"));
        System.out.println("The Game Ends...");
    }

}
