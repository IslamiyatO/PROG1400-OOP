package FinalGrade;

import java.util.Scanner;

public class FinalGrade {

    //    Calculate the final average of all the 5 assignments after user must have entered their scores

    public static void main(String[] args) {


        //    grade variables- make variables for all the assignments
        float assignment;

        Scanner s = new Scanner(System.in);

        // loop six times to get all assignment 6 grades
        float finalGrade = 0.0f;

        // To remove the lowest grade
        float lowest = 100.0f;
        int i = 0;
        do {
            System.out.print("Enter grade for assignment " + (i+1) + "(-1 to end): ");
            assignment = s.nextFloat();

            if (assignment >= 0.0f ) {
                finalGrade += assignment;

                // this will determine the lowest value
                if (assignment < lowest) {
                    lowest = assignment;
                }
            }
            // i = i + 1;  they all mean the same..
            // i += 1;
            i++;

        }while (assignment >= 0.0f);

        // same as finalGrade  = finalGrade - lowest value
        finalGrade -= lowest;
        // subtracting 2 to account for lowest grae and -1 loop
        finalGrade /= (i-2);


        System.out.println("Your final grade is: " + finalGrade);



    }
}
