package Lecture_12.Lecture_12.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Object, Object> objectMap = new HashMap<>();
        objectMap.put(1, "String");
        objectMap.put("String", 11.23);

        Map<String, Integer> map = new HashMap<>();
        map.put("E", 6);
        map.put("C", 4);
        map.put("B", 7);
        map.put("A", 5);
        map.put("F", 6);
        map.put(null, 10);

        System.out.println(map.toString());
        System.out.println(map.containsKey("E"));
        System.out.println(map.containsValue(5));
        System.out.println(map.get("F"));

        // Key + value
        for(String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        // Values
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // Entry
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
