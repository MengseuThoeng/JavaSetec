public class Car {
    String color;
    int maxSpeed;

    // Constructor with no parameters
    Car() {
        color = "white";
        maxSpeed = 120;
    }

    // Constructor with parameters
    Car(String c, int s) {
        color = c;
        maxSpeed = s;
    }

    void start() {
        System.out.println("Car started");
    }

    void accelerate() {
        System.out.println("Car accelerating");
    }
}