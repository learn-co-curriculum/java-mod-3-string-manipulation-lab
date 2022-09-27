# String Manipulation Revisited Lab

## Learning Goals

- Practice using the classes in `java.util.regex`.

## Instructions

The letter e is the most common letter in the English Dictionary. What would the
English language look like without the letter e?

Consider the following starter code:

```java
import java.util.Scanner;

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
```

In the above code, we want to know if the letter e appears in the user's input.
Follow the given instructions and tips:

- Find the number of times the letter e appears in the user's input.
  - This should be case-insensitive, meaning you should count all uppercase and
    lower case Es and es in a given input.
  - Return the number of times the letter e appeared.
- If the letter e appears in the user's input, replace the user's input without
  the letter e.
  - Replace all letter es found in the given `String` object with a space.
  - This should be case-insensitive, meaning you should replace all uppercase
    and lower case Es and es in a given input.
  - Return the `String` object with the letter e replaced.
- Use the methods from the `Matcher` class and the `String` class to help you.

## Example Output

Here are some example runs of the code for your reference. Make sure your output
looks the same when given these values. Also, don't forget to use Regex 101 to
help you when needed!

Example Output 1:

```plaintext
Enter in a sentence:
It's as hard as napping without a pillow.
The letter e was not in the given sentence.
```

Example Output 2:

```plaintext
Enter in a sentence:
Easy peasy lemon squeezy
The letter e appeared 5 times.
Here is that sentence without the letter e:  asy p asy l mon squ  zy
```

Example Output 3:

```plaintext
Enter in a sentence:
Dreams don't work unless you do
The letter e appeared 2 times.
Here is that sentence without the letter e: Dr ams don't work unl ss you do
```

Example Output 4:

```plaintext
Enter in a sentence:
EeeEeeEeek!
The letter e appeared 9 times.
Here is that sentence without the letter e:          k!
```

## Resources

- [Regex 101](https://regex101.com)
