package PrintPower;

import java.util.Scanner;

public class PrintPower {
    public static void main(String[] args) {

        for(int str = 1; str<=10; str++){
            System.out.printf("%10d",str);
        }
        System.out.println();
        System.out.println();

        for(int start = 1; start<=4; start++){
            for(int begin = 1; begin<=10; begin++){
                int sum = (int) Math.pow(begin, start);
                System.out.printf("%10d", sum);
            }
            System.out.println();
        }

    }
}
