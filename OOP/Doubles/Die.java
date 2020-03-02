package OOP.Doubles;

import java.util.Random;

public class Die {
    private int value;

    public int getValue() {
        return this.value;
    }
// you dont need t use the this.value inside the public void roll because its a mutator, only sets value
    public void setValue(int value) {
        this.value = value;
    }

    //    // make the object :  do this is another file
//        int value;
    //add a funtion for the die to be able to roll
    public void roll(){
        Random random = new Random();
        value = random.nextInt(6);
    }

    }

