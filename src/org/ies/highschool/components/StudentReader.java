package org.ies.highschool.components;

import org.ies.highschool.model.Student;

import java.util.Scanner;

public class StudentReader {
    private final Scanner scanner;

    public StudentReader(Scanner scanner) {this.scanner = scanner;}

    public Student askStudent() {
        System.out.println("¿Cuál es su nombre?");
        String name = scanner.nextLine();

        System.out.println("Introduzca sus apellidos:");
        String surName = scanner.nextLine();

        System.out.println("Ahora, introduzca su dirección:");
        String address = scanner.nextLine();

        return new Student (name, surName, address);
    }
}
