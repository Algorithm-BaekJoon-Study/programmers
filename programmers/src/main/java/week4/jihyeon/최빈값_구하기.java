package week4.jihyeon;

import java.util.HashMap;
import java.util.Map;

public class 최빈값_구하기 {

    public int solution(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        int mode = -1;
        int maxFrequency = 0;
        boolean isMultipleModes = false;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                mode = num;
                maxFrequency = frequency;
                isMultipleModes = false;
            } else if (frequency == maxFrequency) {
                isMultipleModes = true;
            }
        }

        if (isMultipleModes) {
            return -1;
        }

        return mode;
    }
}
