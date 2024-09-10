public class Main {

    static class Vehcile {
        void drive() {
            System.out.println("Vehicle is driving");
        }
    }

    static class Car extends Vehcile {
        void start() {
            System.out.println("Car is starting");
        }
    }

    public static void main(String[] args) {

        System.out.println("Below is dog");
        Dog dog = new Dog("Leakena");
        dog.bark();
        dog.wagTail();
        dog.eat();
        dog.sleep();
        System.out.println("====================================");

        System.out.println("Below is cat");
        Cat cat = new Cat("Reak");
        cat.meow();
        cat.purr();
        cat.eat();
        cat.sleep();

        System.out.println("====================================");
        System.out.println("Below is car");
        Car car = new Car();
        car.start();
        car.drive();
    }
}
