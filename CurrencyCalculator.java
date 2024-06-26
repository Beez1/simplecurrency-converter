import java.util.Scanner;

public class CurrencyCalculator {

    // Method to convert USD to EUR
    public static double convertUsdToEur(double usd) {
        double exchangeRateUsdToEur = 0.85; // 1 USD = 0.85 EUR
        return usd * exchangeRateUsdToEur;
    }

    // Method to convert EUR to USD
    public static double convertEurToUsd(double eur) {
        double exchangeRateEurToUsd = 1.18; // 1 EUR = 1.18 USD
        return eur * exchangeRateEurToUsd;
    }
    
    // Method to convert NGN to USD
    public static double convertNgnToUsd(double ngn) {
        double exchangeRateNgnToUsd = 1.0 / 1480.0; // 1480 NGN = 1 USD
        return ngn * exchangeRateNgnToUsd;
    }

    // Method to convert NGN to EUR
    public static double convertNgnToEur(double ngn) {
        double usd = convertNgnToUsd(ngn);
        return convertUsdToEur(usd);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in NGN you want to convert: ");
        double ngn = scanner.nextDouble();
        
        // Converting NGN to USD
        double usdFromNgn = convertNgnToUsd(ngn);
        System.out.println(ngn + " NGN is " + usdFromNgn + " USD");
        
        // Converting NGN to EUR
        double eurFromNgn = convertNgnToEur(ngn);
        System.out.println(ngn + " NGN is " + eurFromNgn + " EUR");
        
        scanner.close();
    }
}
