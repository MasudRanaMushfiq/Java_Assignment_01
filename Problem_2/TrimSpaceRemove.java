package Problem_2;

public class TrimSpaceRemove {
        public static void main(String[] args) {
            String input = "Remove all spaces from this string.";
            String noSpacesString = input.replace(" ", "");

            System.out.println("Original String: \"" + input + "\"");
            System.out.println("String After spaces removed: \"" + noSpacesString + "\"");
        }

}
