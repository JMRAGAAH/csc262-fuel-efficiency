import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Fuel Efficiency Calculator");
        System.out.println("This program calculates the fuel cost per 100 miles");
        System.out.println("and the distance the car can travel with a full tank.");
        System.out.println();

        System.out.print("Enter the gallons of gas in the tank (example: 12.5): ");
        double gallonsInTank = input.nextDouble();

        System.out.print("Enter the fuel efficiency in miles per gallon (example: 25.5): ");
        double milesPerGallon = input.nextDouble();
        if (milesPerGallon <= 0) {
            System.out.println("Error: MPG must be greater than zero.");
            return;
        }

        System.out.print("Enter the price of gas per gallon (example: 4.50): ");
        double pricePerGallon = input.nextDouble();

        double costPer100Miles = (100.0 / milesPerGallon) * pricePerGallon;
        double fullTankDistance = gallonsInTank * milesPerGallon;

        System.out.printf("Fuel cost per 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Distance with a full tank: %.0f miles%n", fullTankDistance);

        input.close();
    }
}
