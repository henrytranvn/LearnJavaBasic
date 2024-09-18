package lesson3;

import lesson3.model.LearnMap;

import java.util.HashMap;
import java.util.Map;

public class LessonThree {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("N1", "English");
        map.put("N2", "France");
        map.put("N3", "Viet Nam");
        map.put("N4", "Germany");
        map.put("N5", "Thai Lan");

        System.out.println("After add data: " + map);

        LearnMap objLearnMap = new LearnMap();
        String keyOne = "N3";
        String keyTwo = "N90";
        boolean isExistKeyOne = objLearnMap.isExistKey(map, keyOne);
        boolean isExistKeyTwo = objLearnMap.isExistKey(map, keyTwo);
        System.out.println("Trang thai cua " + keyOne + " la: " + isExistKeyOne);
        System.out.println("Trang thai cua " + keyTwo + " la: " + isExistKeyTwo);
    }
}
