package com.example.smd_assingment_1_q2;

public class Technician extends Staff {
    private String techType;

    public Technician(String id, String name, String address, String phone, String profession,
                      String empId, String empRole, String empDept, double empSalary, int empExperience,
                      String techType) {
        super(id, name, address, phone, profession, empId, empRole, empDept, empSalary, empExperience);
        this.techType = techType;
    }

    // Method to maintain a lab
    public void Maintain(String lab) {
        // Implement lab maintenance logic
        System.out.println(lab + " maintained.");
    }

    // Method to install a system
    public void Install(String system) {
        // Implement system installation logic
        System.out.println(system + " installed.");
    }
}

