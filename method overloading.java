class Vehicle {
    // Method: drive
    public void drive() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    // Method overriding: drive
    @Override
    public void drive() {
        System.out.println("Car is being driven");
    }

    // Method overloading: drive
    public void drive(int speed) {
        System.out.println("Car is being driven at " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive(); 

        Car car = new Car();
        car.drive(); 

        // Method overloading
        car.drive(100); 
    }
}
