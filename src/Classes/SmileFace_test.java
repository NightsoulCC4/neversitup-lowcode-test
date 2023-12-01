package Classes;

public class SmileFace_test {
    static {
        // Test case.
        String[] smiles1 = { ":)", ";(", ";}", ":-D" };
        int result1 = SmileFace.countSmileys(smiles1);
        System.out.println("Test case 1 result: " + result1);

        // Test case 2.
        String[] smiles2 = { ";D", ":-(", ":-)", ";~)" };
        int result2 = SmileFace.countSmileys(smiles2);
        System.out.println("Test case 2 result: " + result2);

        // Test case 3.
        String[] smiles3 = { ";]", ":[", ";*", ":$", ";-D" };
        int result3 = SmileFace.countSmileys(smiles3);
        System.out.println("Test case 3 result: " + result3);
    }
}
