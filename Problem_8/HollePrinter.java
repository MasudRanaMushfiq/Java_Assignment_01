package Problem_8;

public class HollePrinter {
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        String step1 = inputString.replace("e", "#");

        String step2 = step1.replace("o", "e");

        String finalResult = step2.replace("#", "o");

        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + finalResult);
        System.out.println("Expected Result: Holle, Werld!");
    }
}
