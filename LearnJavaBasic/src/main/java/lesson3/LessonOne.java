package lesson3;

import lesson3.model.Number;

public class LessonOne {
    public static void main(String[] args) {
        int[] arrNumb = {2, 4, 5, 6, 8, 9, 7, 11, 23, 43};

        Number objNumb = new Number();
        int result = objNumb.calSumArray(arrNumb);
        System.out.println("Tong cac so nguyen trong mang la: " + result);
    }
}
