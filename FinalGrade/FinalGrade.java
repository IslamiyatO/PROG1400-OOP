package FinalGrade;

import java.util.Scanner;

public class FinalGrade {

    //    Calculate the final average of all the 5 assignments after user must have entered their scores

    public static void main(String[] args) {


        //    grade variables- as an array // create array in memory to store the data
        float[] assignment = new float[6];

        Scanner s = new Scanner(System.in);

        // loop six times to get all assignment 6 grades
        float finalGrade = 0.0f;

        // To remove the lowest grade
        float lowest = 100.0f;
        for (int i = 0; i<6; i++) {
            System.out.print("Enter grade for assignment " + (i + 1) + "(-1 to end): ");
            assignment[i] = s.nextFloat();

        }

        System.out.println("Your final grade is: " + finalGrade);



    }
}
