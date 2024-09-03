public class CreateRectangle {
    public static void main(String[] args) {
        // Create two instances of Rectangle with different dimensions
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        // Print information about rectangle1
        System.out.println("Rectangle 1");
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        // Print information about rectangle2
        System.out.println("Rectangle 2");
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        System.out.println();

        // Print the total number of rectangles created using the static method getCount
        System.out.println("The total number of rectangles created is: " + Rectangle.getCount());

        // Create an array of Rectangle objects
        Rectangle[] container = new Rectangle[2];

        // Loop to create two more rectangles and store them in the array
        for (int x = 0; x < 2; x++) {
            if (x == 0) {
                container[x] = new Rectangle(5.3, 23.5);
            } else {
                container[x] = new Rectangle(7, 11);
            }
        }

        // Loop to print information about the new rectangles
        for (int x = 0; x < 2; x++) {
            System.out.println("Rectangle " + (x + 1));
            System.out.println("Area: " + container[x].getArea());
            System.out.println("Perimeter: " + container[x].getPerimeter());
        }
    }
}

