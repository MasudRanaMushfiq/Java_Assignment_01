package Lab_Work_1;
import java.util.*;

public class Formate {


        public static void main(String[] args)
        {
            float n = 5.2F;

            // automatically appends zero to the rightmost part
            // of decimal
            System.out.printf(
                    "Formatted to specific width: n = %.4f\n", n);

            n = 2324435.3f;

            // here number is formatted from right margin and
            // occupies a width of 20 characters
            System.out.printf(
                    "Formatted to right margin: n = %20.4f\n", n);

            Scanner scn = new Scanner(System.in);

            String str1 = scn.next();

           System.out.println("Entered String str1 : " + str1);

            String str2 = scn.nextLine();

            System.out.println("Entered String str2 : " + str2);

            int x = scn.nextInt();

            System.out.println("Entered Integer : " + x);

            float f = scn.nextFloat();

            System.out.println("Entered FloatValue : " + f);
        }


}
