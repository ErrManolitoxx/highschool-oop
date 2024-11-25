package org.ies.highschool.model;

import java.util.Objects;

public class Student {

    private String name;
    private String surName;
    private String address;

    public Student(String name, String surName, String address) {
        this.name = name;
        this.surName = surName;
        this.address = address;
    }
    public void showInfo() {
        System.out.println("Nombre: " + name + " Apellidos: " + surName + " dirección: " + address);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surName, student.surName) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, address);
    }
}
