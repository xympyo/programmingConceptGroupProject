import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] LicensePlate = new int[10];
        int[] parkingSpace = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] entryTime = new int[10];
        int[] exitTime = new int[10];
        int vehicleType;
        int park;
        int i = 0;
        boolean statement = true;
        boolean intro = true;
        while (statement) {
            System.out.println("Enter your Vehicle Type : ");
            System.out.println("1. Motorcycle");
            System.out.println("2. Car");
            vehicleType = input.nextInt();
            System.out.println("Enter your License Plate : (Combination of 1 Variable and 3 Integer)");
            System.out.println("For example : (1234)");
            LicensePlate[i] = input.nextInt();
            System.out.println("How can we help ?");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. View Parking Lot");
            int choice = input.nextInt();
            if (choice < 1 && choice > 3) {
                continue;
            } else {
                int indexPark = 0;
                if (choice == 1) {
                    boolean a = true;
                    while (a) {
                        if (vehicleType < 1 && vehicleType > 2) {
                            System.out.println("Please enter valid Input!");
                            continue;
                        } else {
                            a = false;
                            for (int j = 0; j < parkingSpace.length; j++) {
                                if (parkingSpace[j] == 0) {
                                    System.out.println("Parking Space Available!");
                                    for (int x = 0; x < parkingSpace.length; x++) {
                                        if (parkingSpace[x] == 0) {
                                            for (int t = 0; t < parkingSpace.length; t++) {
                                                if (parkingSpace[t] == 0) {
                                                    System.out
                                                            .println("Parking Space in Number " + t + " is available");
                                                } else {
                                                    System.out.println(
                                                            "Parking Space in number " + t + " is not available");
                                                }
                                            }
                                            System.out.println("Please choose where to park. ");
                                            park = input.nextInt();
                                            if (parkingSpace[park] == 0) {
                                                parkingSpace[park] = 1;
                                                indexPark = park;
                                                System.out.println("You have successfully parked! ");
                                                System.out.println("Input entry time : (In Hours)");
                                                entryTime[park] = input.nextInt();
                                                i++;
                                                a = false;
                                                x = parkingSpace.length + 1;
                                                j = parkingSpace.length + 1;
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("No parking space available, please come back later! ");
                                    break;
                                }
                            }
                        }
                    }
                } else if (choice == 2) {
                    boolean exit = true;
                    int counter = 0;
                    int what = i - 1;
                    while (exit) {
                        System.out.println("Please enter your License plate : ");
                        int licenseCheck = input.nextInt();
                        if (licenseCheck == LicensePlate[what]) {
                            parkingSpace[indexPark] = 0;
                            System.out.println("Input exit time : (In Hours)");
                            exitTime[indexPark] = input.nextInt();
                            if (vehicleType < 0 && vehicleType > 1) {
                                continue;
                            } else if (vehicleType == 1) {
                                int motorTime = exitTime[indexPark] - entryTime[indexPark];
                                System.out.println("Your cost will be " + (motorTime * 2500));
                                exit = false;
                            } else {
                                int carTime = exitTime[indexPark] - entryTime[indexPark];
                                System.out.println("Your cost will be " + (carTime * 5000));
                                exit = false;
                            }
                        } else {
                            System.out.println("You have failed for " + counter + " times.");
                            counter++;
                            if (counter == 5) {
                                System.out.println("You have failed too many times, you can not exit your vehicle.");
                                break;
                            }
                        }
                    }
                } else {
                    for (int y = 0; y < parkingSpace.length; y++) {
                        if (parkingSpace[y] == 0) {
                            System.out.println("Empty Space at " + y);
                        } else {
                            System.out.println("There is an occupied parking space at " + y);
                        }
                    }
                }
            }
        }
    }
}
