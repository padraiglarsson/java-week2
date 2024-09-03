import java.util.Scanner;

public class createStock {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // Variables to store stock information
        String name, symbol;
        double previousClosingPrice, currentPrice;

        // Get user input for stock details
        System.out.print("Enter the symbol of the stock: ");
        symbol = keyboard.nextLine();
        System.out.print("Enter the name of the stock: ");
        name = keyboard.nextLine();

        // Create a Stock object with the provided symbol and name
        Stock stock1 = new Stock(symbol, name);

        // Get user input for previous and current prices
        System.out.print("Enter the previous price of the stock: ");
        previousClosingPrice = keyboard.nextDouble();
        System.out.print("Enter the current price of the stock: ");
        currentPrice = keyboard.nextDouble();

        // Set the previous closing price and current price for the stock
        stock1.setPreviousClosingPrice(previousClosingPrice);
        stock1.setCurrentPrice(currentPrice);

        // Display stock details and change percentage
        System.out.println("\nStock Details: " + stock1.getSymbolAndName());
        System.out.printf("Price change percentage: %.2f%%\n", stock1.getChangePercent());
    }
}

