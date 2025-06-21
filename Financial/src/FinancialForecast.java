public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + rate) * calculateFutureValue(presentValue, rate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000.0;  // Starting money
        double annualGrowthRate = 0.08; // 8%
        int years = 5;

        double futureValue = calculateFutureValue(presentValue, annualGrowthRate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
