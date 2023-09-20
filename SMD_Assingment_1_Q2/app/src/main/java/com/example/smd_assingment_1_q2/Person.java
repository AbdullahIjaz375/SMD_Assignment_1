package com.example.smd_assingment_1_q2;

public abstract class Person {
    private String id;
    private String name;
    private String address;
    private String phone;
    private String profession;

    // Constructor
    public Person(String id, String name, String address, String phone, String profession) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.profession = profession;
    }

    // Abstract methods
    public abstract void Register(String uid);
    public abstract void Perform(String duty);
    public abstract void include(String service);
    public abstract void like(String item);
}