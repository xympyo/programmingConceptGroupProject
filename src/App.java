import java.util.Scanner;

public class App {
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
        while (statement) {
            statement = false;
            System.out.println("Enter your License Plate : (Combination of 1 Variable and 3 Integer)");
            System.out.println("For example : (1234)");
            LicensePlate[i] = input.nextInt();
            System.out.println("Enter your Vehicle Type : ");
            System.out.println("1. Motorcycle");
            System.out.println("2. Car");
            vehicleType = input.nextInt();
            System.out.println("How can we help ?");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. View Parking Lot");
            int choice = input.nextInt();
            System.out.println(choice);
            int indexPark = 0;
            if (choice < 1 && choice > 3) {
                continue;
            } else if (choice == 1) {
                System.out.println("What");
                int parkingRoom = 0;
                // while (parkingFloor < parkingSpace[parkingFloor][parkingRoom]) {
                boolean a = true;
                while (a) {
                    int parkingFloorQ = 0;
                    System.out.println(
                            "Choose what floor to park in : (PLEASE ONLY INPUT EITHER FLOOR 1 OR 2)");
                    parkingFloorQ = input.nextInt();
                    parkingFloorQ -= 1;
                    if (parkingFloorQ < 0 && parkingFloorQ > 1) {
                        System.out.println("Invalid Input!, please try again : ");
                        parkingFloorQ = input.nextInt();
                        parkingFloorQ -= 1;
                    } else if (parkingFloorQ == 0) {
                        System.out.println("what");
                        parkingFloorQ = 0;
                        for (int x = 0; x < parkingSpace[parkingFloorQ].length; x++) {
                            if (parkingSpace[parkingFloorQ][parkingRoom] == 0) {
                                for (int t = 0; t < parkingSpace[parkingFloorQ].length; t++) {
                                    if (parkingSpace[parkingFloorQ][t] == 0) {
                                        System.out
                                                .println("[" + t + "] Available. ");
                                    } else {
                                        System.out.println(
                                                "[" + t + "] is not Available.");
                                    }
                                }
                                System.out.println("Please choose where to park. ");
                                park = input.nextInt();
                                park -= 1;
                                if (parkingSpace[parkingFloorQ][park] == 0) {
                                    parkingSpace[parkingFloorQ][park] = 1;
                                    indexPark = park;
                                    System.out.println("Input entry time : (In Hours)");
                                    entryTime[park] = input.nextInt();
                                    System.out.println("You have successfully parked! ");
                                    i++;
                                    statement = true;
                                    a = false;
                                    x = parkingSpace[parkingFloorQ].length + 1;
                                } else {
                                    System.out.println("No empty space in that room, please try again! ");
                                    continue;
                                }
                            }
                        }
                    } else if (parkingFloorQ == 1) {
                        parkingFloorQ = 1;
                        for (int t = 0; t < parkingSpace[parkingFloorQ].length; t++) {
                            if (parkingSpace[parkingFloorQ][parkingRoom] == 0) {
                                System.out
                                        .println("There is an empty Parking Space in Floor 1.");
                                t = parkingSpace.length + 10;
                            } else {
                                System.out.println(
                                        "Sorry, no parking space Available in Floor 1!");
                                System.out.println(
                                        "Will put you in Floor 2!");
                                parkingFloorQ = 2;
                            }
                        }
                        for (int x = 0; x < parkingSpace[parkingFloorQ].length; x++) {
                            if (parkingSpace[parkingFloorQ][parkingRoom] == 0) {
                                for (int t = 0; t < parkingSpace[parkingFloorQ].length; t++) {
                                    if (parkingSpace[parkingFloorQ][parkingRoom] == 0) {
                                        System.out
                                                .println("[" + t + "] Available. ");
                                    } else {
                                        System.out.println(
                                                "[" + t + "] is not Available.");
                                    }
                                }
                                System.out.println("Please choose where to park. ");
                                park = input.nextInt();
                                if (parkingSpace[parkingFloorQ][park] == 0) {
                                    parkingSpace[parkingFloorQ][park] = 1;
                                    indexPark = park;
                                    System.out.println("Input entry time : (In Hours)");
                                    entryTime[park] = input.nextInt();
                                    System.out.println("You have successfully parked! ");
                                    i++;
                                    statement = true;
                                    a = false;
                                    x = parkingSpace.length + 1;
                                    parkingRoom = parkingSpace.length + 1;
                                } else {
                                    System.out.println("No empty space in that room, please try again! ");
                                    continue;
                                }
                            }
                        }
                    }
                }
            } else if (choice == 2) {
                boolean exit = true;
                int counter = 0;
                int what = i - 1;
                while (exit) {
                    System.out.println(
                            "Please enter which floor is your vehicle in (Please only input Floor 1 and 2)");
                    int floorExit = input.nextInt();
                    int exitFloor;
                    if (floorExit < 1 && floorExit > 2) {
                        continue;
                    } else if (floorExit == 1) {
                        floorExit = 0;
                        System.out.println("Please enter your License plate : ");
                        int licenseCheck = input.nextInt();
                        if (licenseCheck == LicensePlate[what]) {
                            parkingSpace[floorExit][indexPark] = 0;
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
                                System.out
                                        .println("You have failed too many times, you can not exit your vehicle.");
                                break;
                            }
                        }
                    } else if (floorExit == 2) {
                        floorExit = 1;
                        System.out.println("Please enter your License plate : ");
                        int licenseCheck = input.nextInt();
                        if (licenseCheck == LicensePlate[what]) {
                            parkingSpace[floorExit][indexPark] = 0;
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
                                System.out
                                        .println("You have failed too many times, you can not exit your vehicle.");
                                break;
                            }
                        }
                    }
                }
            } else {
                boolean choose3 = true;
                while (choose3) {
                    System.out.println("Check which floor you want to check : (Please only Floor 1 and Floor 2)");
                    int checkFloorInput = input.nextInt();
                    int checkFloor;
                    if (checkFloorInput < 1 && checkFloorInput > 2) {
                        continue;
                    } else if (checkFloorInput == 1) {
                        checkFloor = 0;
                        for (int y = 0; y < parkingSpace.length; y++) {
                            if (parkingSpace[checkFloor][y] == 0) {
                                System.out.println("Empty Space at " + y);
                            } else {
                                System.out.println("There is an occupied parking space at " + y);
                            }
                        }
                    } else {
                        checkFloor = 1;
                        for (int y = 0; y < parkingSpace.length; y++) {
                            if (parkingSpace[checkFloor][y] == 0) {
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
}
