package com.example.smd_assingment_1_q2;

public class Faculty extends Staff {
    private String facultySpecialization;
    private String section;
    private int noOfStudents;
    private String qualification;

    public Faculty(String id, String name, String address, String phone, String profession,
                   String empId, String empRole, String empDept, double empSalary, int empExperience,
                   String facultySpecialization, String section, int noOfStudents, String qualification) {
        super(id, name, address, phone, profession, empId, empRole, empDept, empSalary, empExperience);
        this.facultySpecialization = facultySpecialization;
        this.section = section;
        this.noOfStudents = noOfStudents;
        this.qualification = qualification;
    }

    // Method to teach a course
    public void Teach(String course) {
        // Implement teaching logic
        System.out.println("Teaching the course");
    }

    // Method to assess a student's grade
    public void Assess(String student, String grade) {
        // Implement assessment logic
        System.out.println("Assessing grade");
    }
}

