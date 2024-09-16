package lesson2;

public class LessonOne {
    public static void main(String[] args) {
        int[] arrNumb = {2, 6, 5, 9, 7};
        for (int i=0; i< arrNumb.length; i++) {
            if (arrNumb[i] % 2 == 0) {
                System.out.println(arrNumb[i] + " la so chan");
            } else {
                System.out.println(arrNumb[i] + " la so le");
            }
        }
    }
}
