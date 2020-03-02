package Inheritance.Employees;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee manager = new Employee("Big John");
        Grunt grunt   = new Grunt("Little John");

        Grunt grunt2 = new Grunt(grunt);

        System.out.println(manager);
        System.out.println(grunt);
        System.out.println(grunt2);

        if (grunt.equals(grunt2)) {
            System.out.println("They are equal!");
        } else {
            System.out.println("They are NOT equal.");
        }

        String employee = "Little Sue";

        if (manager.equals(manager)) {
            System.out.println("Sue's a manager!");
        } else {
            System.out.println("Sue is NOT a manager...");
        }
    }

}




// To make a copy of the grunt worker.