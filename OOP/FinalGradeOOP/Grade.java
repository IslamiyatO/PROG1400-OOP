package OOP.FinalGradeOOP;

public class Grade {

    private int numberOfAssignments;
    private Assignment[] assignments = new Assignment[6];

    //make a public constructor grade: used one time
    public Grade() {
        this.numberOfAssignments = 0;

    }

    public void addGrade(float grade, float outOf) {
        assignments[numberOfAssignments] = new Assignment(grade,outOf);
         numberOfAssignments++;
    }

    public float getLowestGrade() {
        float lowest = 100.0f;
        for (int i=0; i<assignments.length; i++) {
            if (assignments[i].calculateAverage() < lowest) {
                lowest = assignments[i].calculateAverage();
            }
        }
        return lowest;
    }

    public void displayAllGrades() {
        for (int i=0; i<assignments.length; i++) {
            System.out.println(
                    "Assignment " + (i + 1) + ": " +
                            assignments[i].getMark());
        }
    }

    public void displayLowestGrade() {
        System.out.println("Lowest Grade: " + getLowestGrade());
    }

    public float calculateFinalGrade() {
        // calculate the final grade
        float finalGrade = 0.0f;

        for (int i=0; i<assignments.length; i++) {
            finalGrade += assignments[i].calculateAverage();
        }
        finalGrade -= getLowestGrade();

        // subtracted one to account for optional assignment
        finalGrade /= (assignments.length - 1);

        return finalGrade;
    }
}