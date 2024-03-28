package week02.collection;


import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        Map<String, Integer> intMap = new HashMap<>();

        intMap.put("일", 1);
        intMap.put("이", 2);
        intMap.put("삼", 3);
        intMap.put("사", 4);
        intMap.put("사", 5);

        for (String key: intMap.keySet()){
            System.out.println(key);
        }

        for (Integer value: intMap.values()){
            System.out.println(value);
        }

    }
}
