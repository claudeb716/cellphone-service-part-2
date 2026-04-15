package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Create a new instance of CellPhone
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for cell phone information and set the properties
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();  // Read integer value
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();  // Read entire line till newline
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);

        System.out.print("Dial Phone Number: ");
        String dial = scanner.nextLine();
        cellPhone1.setDial(dial);
        System.out.println("=================================");

        System.out.print("What is the serial number? ");
        int serialNumber2 = scanner.nextInt();  // Read integer value
        cellPhone2.setSerialNumber(serialNumber2);  // Consume newline

        System.out.print("What model is the phone? ");
        String model2 = scanner.nextLine();  // Read entire line till newline
        cellPhone2.setModel(model2);

        System.out.print("Who is the carrier? ");
        String carrier2 = scanner.nextLine();
        cellPhone2.setCarrier(carrier2);

        System.out.print("What is the phone number? ");
        String phoneNumber2 = scanner.nextLine();
        cellPhone2.setPhoneNumber(phoneNumber2);

        System.out.print("Who is the owner of the phone? ");
        String owner2 = scanner.nextLine();
        cellPhone2.setOwner(owner2);

        System.out.print("Dial Phone Number: ");
        String dial2 = scanner.nextLine();
        cellPhone2.setDial(dial2);


     display(cellPhone1);
     display(cellPhone2);
//        cellPhone1.getDial(cellPhone2.getPhoneNumber());
//        cellPhone2.getDial(cellPhone1.getPhoneNumber());

        // Close the scanner
        scanner.close();

//         Display the properties of the phone using getters

    }
    public static void display(CellPhone phone){
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println(phone.getOwner() + "Phone is Calling" + phone.getDial(phone.getPhoneNumber()));
    }
}

