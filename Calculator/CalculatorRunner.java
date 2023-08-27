package Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator calculator2 = new Calculator();

        Double added = calculator.addFunction(20,10, 3, 4.0, 2 );
        Double subtracted = calculator.subtractFunction(30,20);
        Double multiplied = calculator.multiplyFunction(13,3);
        Double divided = calculator.dividedFunction(200,30);

        Double divided1 = calculator2.dividedFunction(50,22);

        System.out.println("Added : " + calculator.addFunction(20,10));
        System.out.println("Subtracted : " + subtracted);
        System.out.println("Multiplied : " + multiplied);
        System.out.println("Divided Another : " + divided1);
    }
}
