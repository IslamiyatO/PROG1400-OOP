package OOP.FinalGradeOOP;

public class Assignment {

    private String description;
    private String dueDate;
    private float mark;
    private float outOf;

    public float getMark() {
        return this.mark;
    }
    public float getOutOf() {
        return this.outOf;
    }

    public Assignment(float mark, float outOf) {
        this.mark = mark;
        this.outOf = outOf;
    }

    public float calculateAverage() {
        return this.mark / this.outOf * 100.0f;
    }

}