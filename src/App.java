import java.util.Scanner;

public class App {
    public static void vehicleEntry() {
        Scanner input = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.println("Enter your Vehicle Type : ");
            System.out.println("1. Motorcycle");
            System.out.println("2. Car");
            int vehicleType = input.nextInt();
            if (vehicleType < 1 && vehicleType > 2) {
                System.out.println("Please enter valid Input!");
                continue;
            } else {
                a = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String LicensePlate[] = {};
        int[] parkingSpace = new int[10];
        int i = 0;
        boolean statement = true;
        System.out.println("Enter your License Plate : (Combination of 1 Variable and 3 Integer)");
        System.out.println("For example : (B234)");
        LicensePlate[i] = input.nextLine();
        while (statement) {
            System.out.println("How can we help ?");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. View Parking Lot");
            int choice = input.nextInt();
            if (choice < 1 && choice > 3) {
                continue;
            } else {
                if (choice == 1) {
                    vehicleEntry();
                }
            }
        }
    }
}
