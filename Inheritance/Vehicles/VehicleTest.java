package Inheritance.Vehicles;

public class VehicleTest extends BaseFunctions {
    public static void main(String[] args) {

        Car car = new Car();
        car.isDiesel = false;
        car.setSpeed(200);
        car.setColour(1);  // red

        Plane plane = new Plane();
        plane.maxAltitude = 10000;
        plane.setSpeed(500);
        plane.setColour(2); // green

        Boat boat = new Boat();
        boat.hasEngine = false;
        boat.setSpeed(10);
        boat.setColour(3); // blue
    }
}