package OOP.FinalGradeOOP;

import java.util.Scanner;

public class FinalGradeOOP {
    public static void main(String[] args) {
        // Create a grade object based on the class
        Grade grade = new Grade();

        //ask user for individual grades
        Scanner s = new Scanner(System.in);

        // loop six times to get all assignment 6 grades


        // To remove the lowest grade

        int i = 0;
        //HAVE one function like add grade
        while(i < 6) {
            System.out.print("Enter grade for assignment " + (i + 1) + ":");
            grade.addGrade(s.nextFloat(), 100.0f);
            i++;
        }

        //determine lowest grade (Grade)
       float lowestGrade = grade.getLowestGrade();

        //display all grades (Grade)
        grade.displayAllGrades();

        //display lowest grade(grade)
        grade.displayLowestGrade();

        //calculate the final grade(grade)
        float finalGrade = grade.calculateFinalGrade();

        //display final grade
        System.out.println("Final Grade: " + finalGrade);
    }

}
