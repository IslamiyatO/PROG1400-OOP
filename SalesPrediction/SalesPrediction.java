package SalesPrediction;

public class SalesPrediction {

    // The east coast sales division of a company generates
    //62 percent of total sales. Based on that percentage,
    //Write a program that will predict how much
    //East coast division will generate if the company
    //has $4.6million in sales year.
    //Hint: Use the value 62% as 0.62;
    public static void main(String[] args) {

        int sales = 4_600_000;
        float percentage = 0.62f;

        //do the prediction calculation
        float prediction = sales * percentage;

        System.out.println("East coast division will generate $" + prediction + " in sales.");
    }
}
