package com.example.smd_assingment_1_q2;

public class Staff extends Person {
    private String empId;
    private String empRole;
    private String empDept;
    private double empSalary;
    private int empExperience;

    public Staff(String id, String name, String address, String phone, String profession,
                 String empId, String empRole, String empDept, double empSalary, int empExperience) {
        super(id, name, address, phone, profession);
        this.empId = empId;
        this.empRole = empRole;
        this.empDept = empDept;
        this.empSalary = empSalary;
        this.empExperience = empExperience;
    }

    // Method to attend a duty
    public void Attend(String duty) {
        // Implement duty attendance logic
        System.out.println("Attending duty.");
    }

    // Method to get a promotion
    public void getPromotion() {
        // Implement promotion logic
        System.out.println("Eligible for a promotion.");
    }

    // Method to get salary
    public double getSalary() {
        // Implement salary retrieval logic
        return empSalary;
    }

    // Implementation of the abstract method Perform(String) from the Person class
    @Override
    public void Perform(String duty) {
        // Provide a default implementation that does nothing
        System.out.println(duty + " performed.");
    }

    // Implementation of the abstract method Register(String) from the Person class
    @Override
    public void Register(String uid) {
        // Provide a default implementation that does nothing
        System.out.println("Person Registered.");
    }

    // Implementation of the abstract method include(String) from the Person class
    @Override
    public void include(String service) {
        // Provide a default implementation that does nothing
        System.out.println(service +" included.");
    }

    // Implementation of the abstract method like(String) from the Person class
    @Override
    public void like(String item) {
        // Provide a default implementation that does nothing
        System.out.println("Like called.");
    }
}




