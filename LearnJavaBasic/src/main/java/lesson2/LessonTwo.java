package lesson2;

import lesson2.model.Employee;
import lesson2.model.Person;

import java.util.ArrayList;

public class LessonTwo {
    public static void main(String[] args) {
        /* Tao 1 doi tuong Person */
        Person objPerson = new Person();
        objPerson.setStrName("Nguyen Tran Trung");
        objPerson.setIntAge(30);
        objPerson.displayInfo();

        /* Tao 1 doi tuong Employee */
        Employee objEmployee = new Employee();
        objEmployee.setStrCodeEmployee("NV01");
        objEmployee.setStrName("Peter");
        objEmployee.setIntAge(25);
        objEmployee.setFloatSalary(35000);
        objEmployee.displayInfo();

        /* Tao danh sach cac Employee */
        Employee objEplFirst = new Employee();
        objEplFirst.setStrCodeEmployee("01");
        objEplFirst.setStrName("David");
        objEplFirst.setIntAge(18);
        objEplFirst.setFloatSalary(39000);

        Employee objEplSecond = new Employee();
        objEplSecond.setStrCodeEmployee("02");
        objEplSecond.setStrName("Shane");
        objEplSecond.setIntAge(33);
        objEplSecond.setFloatSalary(24000);

        Employee objEplThird = new Employee();
        objEplThird.setStrCodeEmployee("03");
        objEplThird.setStrName("Mary");
        objEplThird.setIntAge(33);
        objEplThird.setFloatSalary(23000);

        ArrayList<Employee> arrEmployee = new ArrayList<Employee>();
        arrEmployee.add(objEplFirst);
        arrEmployee.add(objEplSecond);
        arrEmployee.add(objEplThird);

        for (Employee epl : arrEmployee) {
            epl.displayInfo();
        }
    }
}
