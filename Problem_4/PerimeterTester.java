package Problem_4;
import java.awt.Rectangle;

public class PerimeterTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);

        int width = (int) rectangle.getWidth();
        int height = (int) rectangle.getHeight();
        int perimeter = 2 * (width + height);

        System.out.println("Computed Perimeter: " + perimeter);

        int expectedPerimeter = 2 * (5 + 10);
        System.out.println("Expected Perimeter: " + expectedPerimeter);
    }
}

