package lesson3;


import lesson3.model.LearnHashSet;

import java.util.HashSet;
import java.util.Set;

public class LessonTwo {
    public static void main(String[] args) {
        int[] arrNumb = {2, 4, 5, 6, 8, 9, 7, 11, 23, 43};

        Set<String> set = new HashSet<>();
        set.add("Ha Noi");
        set.add("Da Nang");
        set.add("Sai Gon");
        set.add("Nha Trang");
        System.out.println("After add set: " + set);

        LearnHashSet objLearnHashSet = new LearnHashSet();
        String valueCheckOne = "Nha Trang";
        String valueCheckTwo = "Ca Mau";
        boolean isCheckOne = objLearnHashSet.isExist(set, valueCheckOne);
        boolean isCheckTwo = objLearnHashSet.isExist(set, valueCheckTwo);
        System.out.println("Kiem tra gia tri " + valueCheckOne + " co trong mang khong? Trang thai: " + isCheckOne);
        System.out.println("Kiem tra gia tri " + valueCheckTwo + " co trong mang khong? Trang thai: " + isCheckTwo);
    }
}
