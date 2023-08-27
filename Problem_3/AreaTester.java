package Problem_3;

import java.awt.Rectangle;

    public class AreaTester {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 10);

            int width = (int) rectangle.getWidth();
            int height = (int) rectangle.getHeight();
            int area = width * height;

            System.out.println("Computed Area: " + area);

            int expectedArea = 5 * 10;
            System.out.println("Expected Area: " + expectedArea);
        }

}
