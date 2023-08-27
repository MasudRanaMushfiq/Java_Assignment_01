package Problem_9;

public class ReverseTester {
    public static void main(String[] args) {
        String inputString = "desserts";
        StringBuilder stringBuilder = new StringBuilder(inputString);

        stringBuilder.reverse();

        String reversedString = stringBuilder.toString();

        System.out.println("Initial  String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
        System.out.println("Expected  Value: stressed");
    }
}

