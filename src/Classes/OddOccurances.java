package Classes;

import java.util.HashMap;
import java.util.Map;

public class OddOccurances {
    public static int findOddOccurrence(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Count occurrences of each element.
        for (int num : arr) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        // Find the element with odd occurrences.
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }

        // Return -1 if no such element is found.
        return -1;
    }
}
