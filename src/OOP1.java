public class OOP1 {
        public static void main(String[] args) {
            // Creating objects
            Car car1 = new Car();
            Car car2 = new Car("red", 150);

            // Accessing fields
            System.out.println(car1.color); // Output: white
            System.out.println(car2.maxSpeed); // Output: 150

            // Calling methods
            car1.start();
            car2.accelerate();
        }
}
