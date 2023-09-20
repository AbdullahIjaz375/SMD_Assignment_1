package com.example.smd_assingment_1_q2;

public class Student extends Person {
    private String studentId;
    private String major;
    private int year;
    private int semester;
    private String college;
    private String grade;

    public Student(String id, String name, String address, String phone, String profession,
                   String studentId, String major, int year, int semester, String college) {
        super(id, name, address, phone, profession);
        this.studentId = studentId;
        this.major = major;
        this.year = year;
        this.semester = semester;
        this.college = college;
        this.grade = ""; // Initialize grade as an empty string
    }

    // Method to get grade for a course
    public String getGrade(String course) {
        // Implement grade retrieval logic
        // Assuming you have a mechanism to store and retrieve grades for courses
        return grade;
    }

    // Method to attend a class
    public void Attend(String className) {
        // Implement class attendance logic
        System.out.println("Class Attended.");
    }

    // Method to learn
    public void Learn() {
        // Implement learning logic
        System.out.println("Learning.");
    }

    // Implementation of the abstract method Perform(String) from the Person class
    @Override
    public void Perform(String duty) {
        // Provide a default implementation that does nothing
        System.out.println("Duty performed.");
    }

    // Implementation of the abstract method Register(String) from the Person class
    @Override
    public void Register(String uid) {
        // Provide a default implementation that does nothing
        System.out.println("Course Registered.");
    }

    // Implementation of the abstract method include(String) from the Person class
    @Override
    public void include(String service) {
        // Provide a default implementation that does nothing
        System.out.println("Included.");
    }

    // Implementation of the abstract method like(String) from the Person class
    @Override
    public void like(String item) {
        // Provide a default implementation that does nothing
        System.out.println("Like called.");
    }
}



