package Inheritance.Employees;

public class Employee {

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(Employee emp) {
        this.name = emp.name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;

        Employee employee = (Employee)obj;

        return name.equals(employee.name);
    }
}