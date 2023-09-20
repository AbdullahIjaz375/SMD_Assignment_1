package com.example.smd_assingment_1_q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a Student
        Student student = new Student("S001", "John Student", "123 Student St", "555-1111", "Student",
                "ST001", "Computer Science", 2, 3, "University of Tech");

        // Test Student methods
        student.Register("Math 101");
        student.Attend("Math class");
        student.Learn();

        // Create a PGStudent
        PGStudent pgStudent = new PGStudent("PS001", "Alice PGStudent", "456 PG Student St", "555-2222", "PG Student",
                "PGS001", "Data Science", 1, 1, "Tech Institute", "PG001", "Data Science");

        // Test PGStudent methods
        pgStudent.Register("Machine Learning");
        pgStudent.Attend("Machine Learning class");
        pgStudent.Learn();
        pgStudent.SubmitThesis();

        // Create a Staff
        Staff staff = new Staff("E001", "Dr. Smith", "789 Staff St", "555-3333", "Staff",
                "ST002", "Professor", "Computer Science", 75000.0, 10);

        // Test Staff methods
        staff.Attend("Faculty meeting");
        staff.getPromotion();
        double salary = staff.getSalary();
        System.out.println("Salary: " + salary);

        // Create a Faculty
        Faculty faculty = new Faculty("F001", "Dr. Brown", "101 Faculty St", "555-4444", "Faculty",
                "E003", "Assistant Professor", "Physics", 65000.0, 5,
                "Physics", "B", 25, "Ph.D. in Physics");

        // Test Faculty methods
        faculty.Teach("Physics 101");
        faculty.Assess("Jane Doe", "B");

        // Create a Technician
        Technician technician = new Technician("T001", "Bob Technician", "202 Tech St", "555-5555", "Technician",
                "ST003", "Lab Technician", "Chemistry", 60000.0, 3,
                "Chemistry Technician");

        // Test Technician methods
        technician.Maintain("Chemistry Lab");
        technician.Install("Lab Equipment");
    }
}