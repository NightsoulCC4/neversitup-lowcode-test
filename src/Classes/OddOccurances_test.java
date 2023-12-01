package Classes;

public class OddOccurances_test {
    static {
        // Test cases.
        System.out.println("result :" + OddOccurances.findOddOccurrence(new int[] { 7 }));
        System.out.println("result :" + OddOccurances.findOddOccurrence(new int[] { 0 }));
        System.out.println("result :" + OddOccurances.findOddOccurrence(new int[] { 1, 1, 2 }));
        System.out.println("result :" + OddOccurances.findOddOccurrence(new int[] { 0, 1, 0, 1, 0 }));
        System.out.println(
                "result :" + OddOccurances.findOddOccurrence(new int[] { 1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1 }));
    }
}
