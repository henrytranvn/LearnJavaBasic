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
        String valueCheck = "Nha Trang";
        boolean isCheck = objLearnHashSet.isExist(set, valueCheck);
        System.out.println("Kiem tra gia tri " + valueCheck + " co trong mang khong? Trang thai: " + isCheck);
    }
}
