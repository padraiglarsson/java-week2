import java.text.DecimalFormat;

public class Rectangle {
    // Instance variables to store the width and length of the rectangle
    private double width;
    private double length;

    // Static variable to count the number of Rectangle objects created
    private static int count = 0;

    // Default constructor increments the count when a new Rectangle object is created
    public Rectangle() {
        count++;
    }

    // Parameterized constructor sets the width and length and increments the count
    public Rectangle(double newWidth, double newLength) {
        width = newWidth;
        length = newLength;
        count++;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        // Formats area to two decimal places
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.valueOf(df.format(width * length));
    }

    // Method to calculate and return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Static method to get the count of Rectangle objects created
    public static int getCount() {
        return count;
    }
}

