public class Car 
{
    Striclass Car {

    // Properties (Data Members)
    String color;
    int price;

    // Method to run the car
    void run() {
        System.out.println("Car is running");
    }

    // Method to stop the car
    void stop() {
        System.out.println("Car is stopped");
    }

    public static void main(String[] args) {

        // Creating an object of Car
        Car c1 = new Car();

        // Assigning values
        c1.color = "Black";
        c1.price = 1500000;

        // Displaying car details
        System.out.println("Car Color: " + c1.color);
        System.out.println("Car Price: Rs. " + c1.price);

        c1.run();
        c1.stop();
    }
}
}