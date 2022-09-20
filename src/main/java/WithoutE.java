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
        int count = 0;
        Pattern regexPattern = Pattern.compile("[Ee]");
        Matcher matcher = regexPattern.matcher(input);
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static String withoutE(String input) {
        return input.replaceAll("[Ee]", " ");
    }
}
