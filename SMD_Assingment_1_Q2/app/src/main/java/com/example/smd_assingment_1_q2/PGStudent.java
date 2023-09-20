package com.example.smd_assingment_1_q2;

public class PGStudent extends Student {
    private String rollNo;
    private String specialization;

    public PGStudent(String id, String name, String address, String phone, String profession,
                     String studentId, String major, int year, int semester, String college,
                     String rollNo, String specialization) {
        super(id, name, address, phone, profession, studentId, major, year, semester, college);
        this.rollNo = rollNo;
        this.specialization = specialization;
    }

    // Method to submit a thesis
    public void SubmitThesis() {
        // Implement thesis submission logic
        System.out.println(" (Roll No: " + rollNo + ") is submitting the thesis in " + specialization);
    }

    // Implementation of the abstract method include(String) from the Person class
    @Override
    public void include(String service) {
        // Provide a default implementation that does nothing
        // You can add specific logic here if needed for PGStudent
    }

    // Implementation of the abstract method like(String) from the Person class
    @Override
    public void like(String item) {
        // Provide a default implementation that does nothing
        // You can add specific logic here if needed for PGStudent
    }
}


