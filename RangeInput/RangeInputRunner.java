package RangeInput;

public class RangeInputRunner {
    public static void main(String[] args) {
        RangeInput rangeInput = new RangeInput();

        float  midValue = rangeInput.rangeMain(60, 80);
        System.out.println("Initial : " + midValue);
        float midValue2 = rangeInput.add();
        System.out.println("After Increased : " + midValue2);

    }
}
