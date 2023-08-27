package Lab_Work_1;

public class BankBalance {
    public static void main(String[] args) {
        double initial = 1000.0;
        double rate = 0.05;
        int year;

        for (year = 1; year <= 3; year++) {

            double balanceAfterYear = initial + (initial * rate);

            System.out.println("Balance after the" + year + "year: $" + balanceAfterYear);
            initial = balanceAfterYear;


        }
    }
}
