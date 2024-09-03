public class Fan {
    // Constants representing fan speeds
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    // Instance variables to store fan attributes
    private int speed;
    private boolean on;
    private double radius;
    private String colour;

    // Default constructor to initialize fan attributes with default values
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        colour = "blue";
    }

    // Setter methods to modify fan attributes
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setColour(String newColour) {
        colour = newColour;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    // Private helper method to get a string representation of the fan speed
    private String getSpeed() {
        String s = "";
        switch (speed) {
            case SLOW:
                s = "SLOW";
                break;
            case MEDIUM:
                s = "MEDIUM";
                break;
            case FAST:
                s = "FAST";
        }
        return s;
    }

    // Getter methods to retrieve fan attributes
    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    // Override toString method to provide a custom string representation of the fan
    public String toString() {
        if (on) {
            return "\nFan speed: " + getSpeed() + ", colour: " + colour +
                    ", radius: " + radius + "\n";
        } else {
            return "\nFan colour: " + colour + ", radius: " + radius +
                    "\nFan is off\n";
        }
    }
}

