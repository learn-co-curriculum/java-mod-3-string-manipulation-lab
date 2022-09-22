import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WithoutE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in a sentence:");
        String input = scanner.nextLine();

        int numberOfEs = findE(input);

        if (numberOfEs > 0) {
            String noE = withoutE(input);
            System.out.println("The letter e appeared " + numberOfEs + " times.");
            System.out.println("Here is that sentence without the letter e: " + noE);

        } else {
            System.out.println("The letter e was not in the given sentence.");
        }
    }

    public static int findE(String input) {
        // Write your code here!
    }

    public static String withoutE(String input) {
        // Write your code here!
    }
}
