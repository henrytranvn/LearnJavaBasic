package lesson2.model;

import lombok.Data;

@Data
public class Person {
    private String strName;
    private int strAge;

    public void displayInfo() {
        System.out.println("Name: " + getStrName());
        System.out.println("Age:" + getStrAge());
        System.out.println("=======================================================================");
    }
}
