public class Car {
    String model;
    int year;
    String color;

    void displaysTechnicalSpec() {
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
        System.err.println("Car color: " + color);
    }

    int calculateCarYear() {
        return 2026 - year;
    }
}
