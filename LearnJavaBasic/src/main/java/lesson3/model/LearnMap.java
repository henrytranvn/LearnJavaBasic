package lesson3.model;

import java.util.Map;

public class LearnMap {
    public boolean isExistKey ( Map<String, String> map, String key) {
        return map.containsKey(key);
    }
}
