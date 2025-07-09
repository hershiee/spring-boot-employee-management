package com.harshita.employee_management.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String department;

    // Optional constructor without ID
    public Employee(String name, String email, String department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }
}

