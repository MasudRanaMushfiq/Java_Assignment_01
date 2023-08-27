package Problem_7;

public class ReplaceTester {
    public static void main(String[] args) {
        String inputString = "Mississippi";

        String encodedString = inputString.replace("i", "!").replace("s", "$");

        System.out.println("Original String: " + inputString);
        System.out.println("Encoded  String: " + encodedString);
        System.out.println("Expected Result: M!$$!$$!pp!");
    }
}

