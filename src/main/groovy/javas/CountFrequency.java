package javas;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static Map<Integer,Integer> count(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int element: array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) +1);
        }
        return frequencyMap;
    }
}
