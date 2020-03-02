package Inheritance.Employees;

public class Grunt extends Employee {

    private int workingHours;

    public Grunt(String name) {
        super(name);
        this.workingHours = 8;
    }

    public Grunt(Grunt emp) {
        super(emp);
        this.workingHours = emp.workingHours;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", name, workingHours);
    }
}
