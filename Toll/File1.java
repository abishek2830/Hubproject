import java.util.Scanner;

public class File1{
    
    public static double calculateTollFee(String vehicleType, boolean hasRFIDPass) {
        int tollFee = 0;

        if (vehicleType.equalsIgnoreCase("Car")) {
            tollFee = 100;
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            tollFee = 200;
        } else {
            System.out.println("Invalid vehicle type!");
            return -1; 
        }

        
        if (hasRFIDPass) {
            tollFee *= 0.9; 
        }

        return tollFee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vehicles to process: ");
        int numberOfVehicles = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= numberOfVehicles; i++) {
            System.out.println("\nProcessing vehicle " + i + ":");
            
            
            System.out.print("Enter vehicle type (Car/Truck): ");
            String vehicleType = scanner.nextLine();

            
            System.out.print("Does the vehicle have an RFID pass? (true/false): ");
            boolean hasRFIDPass = scanner.nextBoolean();
            scanner.nextLine(); 
            
            double tollFee = calculateTollFee(vehicleType, hasRFIDPass);
            if (tollFee != -1) {
                System.out.println("Toll fee for this vehicle: ₹" + tollFee);
            }
        }

        scanner.close();
    }
}
