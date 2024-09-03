import java.util.Scanner;

public class CreateCar {
    public static void main(String[] args) {

        // Create an array to store Car objects
        Car[] cars = new Car[2];

        // Variables to store user input
        String make, regNo;
        int price, yearOfManufacture;

        // Create a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // Loop to collect information for each car
        for (int counter = 0; counter < cars.length; counter++) {
            System.out.print("Enter the make of car " + (counter + 1) + ": ");
            make = keyboard.nextLine();

            System.out.print("Enter the year of manufacture for Car " + (counter + 1) + ": ");
            yearOfManufacture = keyboard.nextInt();
            keyboard.nextLine();  // Consume the newline character

            System.out.print("Enter the registration number for Car " + (counter + 1) + ": ");
            regNo = keyboard.nextLine();

            System.out.print("Enter the price for Car " + (counter + 1) + ": ");
            price = keyboard.nextInt();
            keyboard.nextLine();  // Consume the newline character

            // Create a new Car object with the provided details and store it in the array
            cars[counter] = new Car(make, yearOfManufacture, regNo, price);

            System.out.println();  // Print a blank line for better readability
        }

        // Loop to print details for each car
        for (int counter = 0; counter < cars.length; counter++) {
            System.out.println("Details for Car " + (counter + 1) + ": ");
            cars[counter].printCarInfo();
        }
    }
}

