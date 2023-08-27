package Calculator;

public class Calculator {
    public double addFunction(double ... numbers){
        double sum = 0.0;
        for(double number: numbers){
            sum = sum + number;
        }
        return sum;
    }

    public double subtractFunction(double first, double second){
        return first - second;
    }

    public double multiplyFunction(double first, double second){
        return first * second;
    }

    public double dividedFunction(double first, double second){
        return first / second;
    }


}
