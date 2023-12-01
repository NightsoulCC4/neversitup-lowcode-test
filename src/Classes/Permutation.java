package Classes;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<String> generatePermutations(String inputStr) {
        List<String> result = new ArrayList<>();

        if (inputStr.length() <= 1) {
            result.add(inputStr);
            return result;
        }

        for (int i = 0; i < inputStr.length(); i++) {
            char currentChar = inputStr.charAt(i);
            String remainingChars = inputStr.substring(0, i) + inputStr.substring(i + 1);
            List<String> permutationsOfRemaining = generatePermutations(remainingChars);

            for (String perm : permutationsOfRemaining)
                result.add(currentChar + perm);
        }

        return result;
    }
}
