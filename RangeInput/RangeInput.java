package RangeInput;

public class RangeInput {
    public float mid;
    public float rangeMain(int min, int max){
        mid = (min+max)/2;
        return mid;
    }

    public float add(){
        mid= mid + 1;
        return mid;
    }

    public float sub(){
        mid = mid + 1;
        return  mid;
    }
}
