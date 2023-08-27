package Lab_Work_1;

public class Print_sum {
    private int stat;
    public Print_sum(){
        stat=0;
    }

    public int product_sum(){
        for(int one = 1; one <= 10; one++){
            stat = stat + one;
        }
        return stat;
    }
}
