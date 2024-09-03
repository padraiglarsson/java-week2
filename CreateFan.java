public class CreateFan {
    public static void main(String[] args) {
        // Constants representing fan speeds
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        // Create two instances of Fan
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        // Set attributes for fan1
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColour("yellow");
        fan1.turnOn();

        // Set attributes for fan2
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColour("blue");
        fan2.turnOff();

        // Print information about fan1 and fan2 using their toString() methods
        System.out.println(fan1);
        System.out.println(fan2.toString());
    }
}

