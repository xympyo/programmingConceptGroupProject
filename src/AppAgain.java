import java.util.Scanner;

public class AppAgain {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] LicensePlate = new int[10];
        int[][] parkingSpace = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
        int[] entryTime = new int[10];
        int[] exitTime = new int[10];
        int vehicleType;
        int park;
        int i = 0;
        boolean statement = true;
        boolean intro = true;
        int parkingFloor;
        while (statement) {
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
                    parkingFloor = 0;
                    boolean a = true;
                    System.out.println("Please enter which floor to park in : (Only 1 and 2 Please.)");
                    parkingFloor = input.nextInt();
                    parkingFloor -= 1;
                    if (parkingFloor < 0 && parkingFloor > 1) {
                        System.out.println("Invalid Input, please enter a proper one!");
                    }
                    if (parkingFloor == 0) {
                        while (a) {
                            System.out.println("Enter your Vehicle Type : ");
                            System.out.println("1. Motorcycle");
                            System.out.println("2. Car");
                            vehicleType = input.nextInt();
                            System.out.println("Enter your License Plate : (Please enter a combination of 4 Integer.)");
                            System.out.println("For example : (1234)");
                            LicensePlate[i] = input.nextInt();
                            if (vehicleType < 1 && vehicleType > 2) {
                                System.out.println("Please enter valid Input!");
                                continue;
                            } else {
                                a = false;
                                for (int j = 0; j < parkingSpace[parkingFloor].length; j++) {
                                    if (parkingSpace[parkingFloor][j] == 0) {
                                        int counter = 0;
                                        counter += 1;
                                        if (j == 9) {
                                            System.out.println("Done");
                                            for (int t = 0; t < parkingSpace[parkingFloor].length; t++) {
                                                if (parkingSpace[parkingFloor][t] == 0) {
                                                    counter += 1;
                                                }
                                            }
                                            if (counter > 0) {
                                                System.out.println("Parking Space Available!");
                                                for (int x = 0; x < parkingSpace[parkingFloor].length; x++) {
                                                    if (parkingSpace[parkingFloor][x] == 0) {
                                                        for (int t = 0; t < parkingSpace[parkingFloor].length; t++) {
                                                            if (parkingSpace[parkingFloor][t] == 0) {
                                                                System.out
                                                                        .println("[" + t
                                                                                + "] is available");
                                                            } else {
                                                                System.out.println(
                                                                        "[" + t + "] is not available");
                                                            }
                                                        }
                                                        System.out.println("Please choose where to park. ");
                                                        park = input.nextInt();
                                                        park -= 1;
                                                        if (parkingSpace[parkingFloor][park] == 0) {
                                                            parkingSpace[parkingFloor][park] = 1;
                                                            indexPark = park;
                                                            System.out.println("You have successfully parked! ");
                                                            System.out.println("Input entry time : (In Hours)");
                                                            entryTime[park] = input.nextInt();
                                                            i++;
                                                            a = false;
                                                            x = parkingSpace[parkingFloor].length + 1;
                                                            j = parkingSpace[parkingFloor].length + 1;
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("No parking space available in this floor. ");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (parkingFloor == 1) {
                        while (a) {
                            System.out.println("Enter your Vehicle Type : ");
                            System.out.println("1. Motorcycle");
                            System.out.println("2. Car");
                            vehicleType = input.nextInt();
                            System.out.println("Enter your License Plate : (Please enter a combination of 4 Integer.)");
                            System.out.println("For example : (1234)");
                            LicensePlate[i] = input.nextInt();
                            if (vehicleType < 1 && vehicleType > 2) {
                                System.out.println("Please enter valid Input!");
                                continue;
                            } else {
                                a = false;
                                for (int j = 0; j < parkingSpace[parkingFloor].length; j++) {
                                    if (parkingSpace[parkingFloor][j] == 0) {
                                        int counter = 0;
                                        counter += 1;
                                        if (j == 9) {
                                            System.out.println("Done");
                                            for (int t = 0; t < parkingSpace[parkingFloor].length; t++) {
                                                if (parkingSpace[parkingFloor][t] == 0) {
                                                    counter += 1;
                                                }
                                            }
                                            if (counter > 0) {
                                                System.out.println("Parking Space Available!");
                                                for (int x = 0; x < parkingSpace[parkingFloor].length; x++) {
                                                    if (parkingSpace[parkingFloor][x] == 0) {
                                                        for (int t = 0; t < parkingSpace[parkingFloor].length; t++) {
                                                            if (parkingSpace[parkingFloor][t] == 0) {
                                                                System.out
                                                                        .println("[" + t
                                                                                + "] is available");
                                                            } else {
                                                                System.out.println(
                                                                        "[" + t + "] is not available");
                                                            }
                                                        }
                                                        System.out.println("Please choose where to park. ");
                                                        park = input.nextInt();
                                                        park -= 1;
                                                        if (parkingSpace[parkingFloor][park] == 0) {
                                                            parkingSpace[parkingFloor][park] = 1;
                                                            indexPark = park;
                                                            System.out.println("You have successfully parked! ");
                                                            System.out.println("Input entry time : (In Hours)");
                                                            entryTime[park] = input.nextInt();
                                                            i++;
                                                            a = false;
                                                            x = parkingSpace[parkingFloor].length + 1;
                                                            j = parkingSpace[parkingFloor].length + 1;
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("No parking space available in this floor. ");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (choice == 2) {
                    System.out.println("Enter your Vehicle Type : ");
                    System.out.println("1. Motorcycle");
                    System.out.println("2. Car");
                    vehicleType = input.nextInt();
                    boolean exit = true;
                    int counter = 0;
                    int what = i - 1;
                    while (exit) {
                        parkingFloor = 0;
                        System.out.println("Please enter which floor is your vehicle in. ");
                        parkingFloor = input.nextInt();
                        parkingFloor -= 1;
                        if (parkingFloor == 0) {
                            System.out.println("Please enter your License plate : ");
                            int licenseCheck = input.nextInt();
                            if (licenseCheck == LicensePlate[what]) {
                                parkingSpace[parkingFloor][indexPark] = 0;
                                System.out.println("Input exit time : (In Hours)");
                                exitTime[indexPark] = input.nextInt();
                                if (vehicleType < 0 && vehicleType > 1) {
                                    continue;
                                } else if (vehicleType == 1) {
                                    int motorTime = entryTime[indexPark] - exitTime[indexPark];
                                    System.out.println("Your cost will be " + (motorTime * 2500));
                                    exit = false;
                                } else {
                                    int carTime = entryTime[indexPark] - exitTime[indexPark];
                                    System.out.println("Your cost will be " + (carTime * 5000));
                                    exit = false;
                                }
                            } else {
                                System.out.println("You have failed for " + counter + " times.");
                                counter++;
                                if (counter == 5) {
                                    System.out
                                            .println("You have failed too many times, you can not exit your vehicle.");
                                    break;
                                }
                            }
                        }
                        if (parkingFloor == 1) {
                            System.out.println("Please enter your License plate : ");
                            int licenseCheck = input.nextInt();
                            if (licenseCheck == LicensePlate[what]) {
                                parkingSpace[parkingFloor][indexPark] = 0;
                                System.out.println("Input exit time : (In Hours)");
                                exitTime[indexPark] = input.nextInt();
                                if (vehicleType < 0 && vehicleType > 1) {
                                    continue;
                                } else if (vehicleType == 1) {
                                    int motorTime = entryTime[indexPark] - exitTime[indexPark];
                                    System.out.println("Your cost will be " + (motorTime * 2500));
                                    exit = false;
                                } else {
                                    int carTime = entryTime[indexPark] - exitTime[indexPark];
                                    System.out.println("Your cost will be " + (carTime * 5000));
                                    exit = false;
                                }
                            } else {
                                System.out.println("You have failed for " + counter + " times.");
                                counter++;
                                if (counter == 5) {
                                    System.out
                                            .println("You have failed too many times, you can not exit your vehicle.");
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    for (int f = 0; f < parkingSpace.length; f++) {
                        System.out.println("This is Floor " + f);
                        for (int y = 0; y < parkingSpace[f].length; y++) {
                            if (parkingSpace[f][y] == 0) {
                                System.out.println("[" + y + "] is available.");
                            } else {
                                System.out.println("[" + y + "] is not available.");
                            }
                        }
                    }
                }
            }
        }
    }
}
