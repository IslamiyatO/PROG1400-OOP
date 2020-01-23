package FinalGrade;

import java.util.Scanner;

public class FinalGrade {

    //    Calculate the final average of all the 5 assignments after user must have entered their scores

    public static void main(String[] args) {


        //    grade variables- as an array // create array in memory to store the data
        float[] assignments = new float[6];

        Scanner s = new Scanner(System.in);

        // loop six times to get all assignment 6 grades


        // To remove the lowest grade

        for (int i = 0; i<assignments.length; i++) {
            System.out.print("Enter grade for assignment " + (i + 1) + ":");
            assignments[i] = s.nextFloat();
        }

        // to find the lowest grade
        float lowest = 100.0f;
        int lowestIndex = 0;
        for (int i = 0; i<assignments.length; i++) {
            if (assignments[i] < lowest){
                lowest = assignments[i];
                lowestIndex = i;
            }

        }

        // To display all the grades
        for (int i = 0; i<6; i++) {
            if(i == lowestIndex){
                System.out.println("Assignment " + (i+1) + ": " +
                        assignments[i] + " is the lowest ( hence dropped)");
            }

        }
        //Calculate the final grade
        float finalGrade = 0.0f;
        //assignments.length is to determine the size of the array
        for (int i = 0; i<assignments.length; i++) {
            if (i != lowestIndex) {
                finalGrade += assignments[i];
            }
        }

        //subtract one from the length when doing the division
        finalGrade /= (assignments.length - 1);
        System.out.println("Your final grade is: " + finalGrade);


    }
}
