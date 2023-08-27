package Lab_Work_1;

public class ProductSum {
    private int stat;
    public ProductSum(){
        stat=1;
    }

    public int productSum(){
        for(int one = 1; one <= 10; one++){
            stat = stat * one;
        }
        return stat;
    }
}
