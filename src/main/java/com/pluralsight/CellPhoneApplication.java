package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Create a new instance of CellPhone
        CellPhone cellPhone1 = new CellPhone();
//        CellPhone cellPhone2 = new CellPhone();

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

     display(cellPhone1);
//     display(cellPhone2);

        // Close the scanner
        scanner.close();

//         Display the properties of the phone using getters

    }
    public static void display(CellPhone phone1){
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + phone1.getSerialNumber());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Carrier: " + phone1.getCarrier());
        System.out.println("Phone Number: " + phone1.getPhoneNumber());
        System.out.println("Owner: " + phone1.getOwner());
        System.out.println(phone1.getOwner() + "Phone is Calling" + phone1.getDial());
    }
}

