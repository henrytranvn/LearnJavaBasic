package lesson3.model;

public class Number {
    public int calSumArray (int[] arrNumb) {
        int sum = 0;
        for (int i=0; i< arrNumb.length; i++) {
              sum = sum + i;
        }
        return sum;
    }
}
