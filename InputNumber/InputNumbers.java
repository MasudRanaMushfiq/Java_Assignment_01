package InputNumber;
import java.util.Scanner;

public class InputNumbers {

    public static void main(String[] args) {
        int numbers1 = 0, max = 0, min = 0;

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        System.out.println("Number Input is: " + num);

        for(int str = 1; str<=num; str++){
            int number = scn.nextInt();
            if(str==1)
                min = number;
            if(max<number){
                max = number;
            }
            if(min>number){
                min = number;
            }
            numbers1 = numbers1 + number;
        }

        System.out.println("Avarage: " + numbers1/num);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


    }




}
