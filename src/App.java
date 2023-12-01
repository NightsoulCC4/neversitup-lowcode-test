
// Remove these comment if you want to use alternative way.
/* import java.util.Scanner; */

import Classes.Permutation_test;
import Classes.OddOccurances_test;
import Classes.SmileFace_test;

public class App {
    public static void main(String[] args) throws Exception {
        // 2. Permutations.
        new Permutation_test();

        // Alternative way (Customized your test case).
        /*
         * Scanner scan = new Scanner(System.in);
         * System.out.print("Enter text: ");
         * 
         * String input = scan.nextLine();
         * System.out.println(Permutation.generatePermutations(input));
         * 
         * scan.close();
         */

        // 3. Find the odd int.
        new OddOccurances_test();

        // Alternative way (Customized your test case).
        /*
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.print("Enter the length of the array: ");
         * int length = scanner.nextInt();
         * 
         * int[] arr = new int[length];
         * 
         * System.out.println("Enter the numbers for the array:");
         * for (int i = 0; i < length; i++) {
         * System.out.print("Number " + (i + 1) + ": ");
         * arr[i] = scanner.nextInt();
         * }
         * 
         * // Call the function with the user-input array
         * int result = OddOccurances.findOddOccurrence(arr);
         * 
         * System.out.println("The element with odd occurrences is: " + result);
         * 
         * scanner.close();
         */

        // 4. Count the smiley faces!
        new SmileFace_test();

        // Alternative way (Customized your test case).
        /*
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.print("Enter the number of smiley faces: ");
         * int numberOfSmileys = scanner.nextInt();
         * scanner.nextLine(); // Consume the newline character
         * 
         * String[] smiles = new String[numberOfSmileys];
         * 
         * System.out.println("Enter the smiley faces:");
         * for (int i = 0; i < numberOfSmileys; i++) {
         * System.out.print("Smiley face " + (i + 1) + ": ");
         * smiles[i] = scanner.nextLine();
         * }
         * 
         * // Call the function with the user-input smiley faces
         * int result = SmileFace.countSmileys(smiles);
         * 
         * System.out.println("The total number of smiling faces is: " + result);
         * 
         * scanner.close();
         */
    }
}
