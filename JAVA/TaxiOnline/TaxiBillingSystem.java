import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Taxi {
    String id;
    String driverName;
    String plateNumber;
    String type;

    public Taxi(String id, String driverName, String plateNumber, String type) {
        this.id = id;
        this.driverName = driverName;
        this.plateNumber = plateNumber;
        this.type = type;
    }
}

class Passenger {
    String name;
    String pickupLocation;
    String destinationLocation;
    double distance;

    public Passenger(String name, String pickupLocation, String destinationLocation, double distance) {
        this.name = name;
        this.pickupLocation = pickupLocation;
        this.destinationLocation = destinationLocation;
        this.distance = distance;
    }
}

class Invoice {
    Taxi taxi;
    Passenger passenger;
    Date date;
    double fare;
    double discount;
    double totalFare;

    public Invoice(Taxi taxi, Passenger passenger, Date date, double fare, double discount, double totalFare) {
        this.taxi = taxi;
        this.passenger = passenger;
        this.date = date;
        this.fare = fare;
        this.discount = discount;
        this.totalFare = totalFare;
    }

    public void printInvoice() {
        System.out.println("Driver Name: " + taxi.driverName);
        System.out.println("Passenger Name: " + passenger.name);
        System.out.println("Pickup Location: " + passenger.pickupLocation);
        System.out.println("Destination Location: " + passenger.destinationLocation);
        System.out.println("Date: " + date);
        System.out.println("Fare: " + fare);
        System.out.println("Discount: " + discount);
        System.out.println("Total Fare: " + totalFare);
    }
}

class Driver {
    String username;
    String password;
    Taxi taxi;

    public Driver(String username, String password, Taxi taxi) {
        this.username = username;
        this.password = password;
        this.taxi = taxi;
    }
}

public class TaxiBillingSystem {
    static List<Taxi> taxis = new ArrayList<>();
    static List<Passenger> passengers = new ArrayList<>();
    static List<Driver> drivers = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Add sample data
        Taxi taxi1 = new Taxi("T001", "John Doe", "AB1234CD", "regular");
        Taxi taxi2 = new Taxi("T002", "Jane Smith", "EF5678GH", "electric");
        taxis.add(taxi1);
        taxis.add(taxi2);

        drivers.add(new Driver("john_doe", "password123", taxi1));
        drivers.add(new Driver("jane_smith", "password456", taxi2));

        try {
            Driver loggedInDriver = login();
            String passengerName = getInput("Enter passenger name: ");
            String pickupLocation = getInput("Enter pickup location: ");
            String destinationLocation = getInput("Enter destination location: ");
            double distance = getDoubleInput("Enter distance (km): ");
            Passenger passenger = new Passenger(passengerName, pickupLocation, destinationLocation, distance);
            passengers.add(passenger);

            Taxi selectedTaxi = loggedInDriver.taxi;

            double fare = calculateFare(selectedTaxi, distance);
            double discount = calculateDiscount(selectedTaxi, fare);
            double totalFare = fare - discount;

            Invoice invoice = new Invoice(selectedTaxi, passenger, new Date(), fare, discount, totalFare);
            invoice.printInvoice();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static Driver login() throws Exception {
        System.out.println("Driver Login");
        String username = getInput("Enter username: ");
        String password = getInput("Enter password: ");

        for (Driver driver : drivers) {
            if (driver.username.equals(username) && driver.password.equals(password)) {
                System.out.println("Login successful!");
                return driver;
            }
        }

        throw new Exception("Invalid username or password!");
    }

    private static String getInput(String prompt) throws Exception {
        System.out.print(prompt);
        String input = scanner.nextLine();
        if (input.trim().isEmpty()) {
            throw new Exception("Input cannot be empty!");
        }
        return input;
    }

    private static double getDoubleInput(String prompt) throws Exception {
        System.out.print(prompt);
        String input = scanner.nextLine();
        if (input.trim().isEmpty()) {
            throw new Exception("Input cannot be empty!");
        }
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new Exception("Invalid number format!");
        }
    }

    private static double calculateFare(Taxi taxi, double distance) {
        double fare = 0;
        if (taxi.type.equals("regular")) {
            fare += 9000;
            if (distance <= 10) {
                fare += distance * 6000;
            } else if (distance <= 30) {
                fare += 10 * 6000 + (distance - 10) * 5200;
            } else {
                fare += 10 * 6000 + 20 * 5200 + (distance - 30) * 5000;
            }
        } else if (taxi.type.equals("electric")) {
            fare += 10000;
            fare += distance * 6300;
        }
        return fare;
    }

    private static double calculateDiscount(Taxi taxi, double fare) {
        if (taxi.type.equals("electric")) {
            return fare * 0.17;
        }
        return 0;
    }
}
