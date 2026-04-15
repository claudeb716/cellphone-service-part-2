package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
    public String dial;

    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public String getDial(String phoneNumber) {
        return dial;
    }

    public void setDial(String dial) {
        this.dial = dial;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

//    public static void display(){
//        System.out.println("\nCellPhone Details:");
//        System.out.println("Serial Number: " + getSerialNumber);
//        System.out.println("Model: " + this.model);
//        System.out.println("Carrier: " + this.carrier);
//        System.out.println("Phone Number: " + this.phoneNumber);
//        System.out.println("Owner: " + this.owner);
//        System.out.println("Dialing: " + this.dial);
//    }
}
