package lesson2.model;

import lombok.Data;

@Data
public class Person {
    private String strName;
    private int intAge;

    public void displayInfo() {
        System.out.println("Name: " + getStrName());
        System.out.println("Age:" + getIntAge());
        System.out.println("=======================================================================");
    }
}
