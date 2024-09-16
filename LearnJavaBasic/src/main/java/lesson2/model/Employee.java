package lesson2.model;

import lombok.Data;

@Data
public class Employee extends Person {
    private String strCodeEmployee;
    private float floatSalary;

    public void displayInfo () {
        System.out.println("Code Emmployee: " + getStrCodeEmployee());
        System.out.println("Name: " + getStrName());
        System.out.println("Age: " + getStrAge());
        System.out.println("Salary: " + getFloatSalary());
        System.out.println("=======================================================================");
    }
}
