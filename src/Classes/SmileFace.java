package Classes;

public class SmileFace {
    public static int countSmileys(String[] arr) {
        int count = 0;
        String validSmileyRegex = "[:;][-~]?[)D]";

        for (String face : arr) {
            if (face.matches(validSmileyRegex)) {
                count++;
            }
        }

        return count;
    }
}
