import java.util.*;

public class InvestmentProjection {

    private static Map<Integer, Double> cache = new HashMap<>();

    // Computes the projected value recursively using memoization
    public static double computeProjection(double amount, double growthRate, int duration) {
        if (cache.containsKey(duration)) {
            return cache.get(duration);
        }

        if (duration == 0) {
            return amount;
        }

        double calculatedValue = computeProjection(amount * (1 + growthRate), growthRate, duration - 1);
        cache.put(duration, calculatedValue);
        return calculatedValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        // Gather user input
        System.out.print("Enter starting investment amount: ");
        double baseAmount = input.nextDouble();

        System.out.print("Enter yearly interest rate (decimal format): ");
        double interest = input.nextDouble();

        System.out.print("Enter investment period (years): ");
        int period = input.nextInt();

        // Call the projection method and display result
        double projectedAmount = computeProjection(baseAmount, interest, period);
        System.out.printf("Projected Value after %d years: %.2f%n", period, projectedAmount);

        input.close();
    }
}
