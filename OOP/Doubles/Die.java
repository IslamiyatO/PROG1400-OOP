package OOP.Doubles;

import java.util.Random;

public class Die {
    // make the object :  do this is another file
        int value;
    //add a funtion for the die to be able to roll
    public void roll(){
        Random random = new Random();
        value = random.nextInt(6);
    }

    }

