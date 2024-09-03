public class Stock {
    // Instance variables to store stock information
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Default constructor (not used in this code)
    public Stock() {

    }

    // Parameterized constructor to initialize symbol and name
    public Stock(String newSymbol, String newName) {
        this.symbol = newSymbol;
        this.name = newName;
    }

    // Setter method to set the previous closing price
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    // Setter method to set the current price
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // Method to calculate and return the change percentage in the stock price
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    // Method to get the symbol and name of the stock
    public String getSymbolAndName() {
        return symbol + " " + name;
    }
}
