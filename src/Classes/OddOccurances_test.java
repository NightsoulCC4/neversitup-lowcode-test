package Classes;

public class OddOccurances_test {
    static {
        // Test cases.
        System.out.println("result :" + OddOccurances.findOddOccurrence(new int[] { 7 }));

        // Test cases 2.
        System.out.println("result :" + OddOccurances.findOddOccurrence(new int[] { 0 }));

        // Test cases 3.
        System.out.println("result :" + OddOccurances.findOddOccurrence(new int[] { 1, 1, 2 }));

        // Test cases 4.
        System.out.println("result :" + OddOccurances.findOddOccurrence(new int[] { 0, 1, 0, 1, 0 }));

        // Test cases 5.
        System.out.println(
                "result :" + OddOccurances.findOddOccurrence(new int[] { 1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1 }));
    }
}
