package Inheritance.Vehicles;

public class Vehicle extends BaseFunctions {
    private int speed;
    private int colour;
    protected int direction;

    public void setSpeed(int speed) {
        log("Changing speed from " + this.speed +
                " to " + speed);
        this.speed = speed;
    }

    public void setColour(int colour) {
        log("Changing colour from " + this.colour +
                " to " + colour);
        this.colour = colour;
    }
}
