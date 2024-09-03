public class Car {

    // Private member variables to store information about the car
    private String make;
    private int yearOfManufacture;
    private String regNo;
    private int price;

    // Default constructor with no parameters
    public Car() {

    }

    // Parameterized constructor to initialize the car's properties
    public Car(String itsMake, int whenBuilt, String regNo, int costPrice) {
        this.make = itsMake;
        this.yearOfManufacture = whenBuilt;
        this.regNo = regNo;
        this.price = costPrice;
    }

    // Method to print information about the car
    public void printCarInfo() {
        System.out.println("The car is a " + make);
        System.out.println("The registration number is " + regNo);
        System.out.println("It was built in " + yearOfManufacture);
        System.out.println("It cost £" + price + " to buy");
    }

    // Getter method to retrieve the price of the car
    public int getPrice() {
        return price;
    }
}

