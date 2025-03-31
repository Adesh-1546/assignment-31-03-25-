package com.assignment;
/*Create a Doctor class with instance variables doctorName, specialization, hospitalName, experienceYears, consultationFee, contactNumber and hospitalLocation.
Create at least two objects, assign values, and print their details.         */

public class Doctor {
    // Instance variables
    private String doctorName;
    private String specialization;
    private String hospitalName;
    private int experienceYears;
    private double consultationFee;
    private String contactNumber;
    private String hospitalLocation;

    // Constructor
    public Doctor(String doctorName, String specialization, String hospitalName, int experienceYears, double consultationFee, String contactNumber, String hospitalLocation) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.hospitalName = hospitalName;
        this.experienceYears = experienceYears;
        this.consultationFee = consultationFee;
        this.contactNumber = contactNumber;
        this.hospitalLocation = hospitalLocation;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Experience: " + experienceYears + " years");
        System.out.println("Consultation Fee: $" + consultationFee);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Hospital Location: " + hospitalLocation);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Creating objects
        Doctor doctor1 = new Doctor("Dr. John Smith", "Cardiologist", "City Hospital", 15, 200.0, "123-456-7890", "New York");
        Doctor doctor2 = new Doctor("Dr. Emily Brown", "Dermatologist", "Sunshine Clinic", 10, 150.0, "987-654-3210", "Los Angeles");

        // Displaying details
        doctor1.displayDetails();
        doctor2.displayDetails();
    }
}

