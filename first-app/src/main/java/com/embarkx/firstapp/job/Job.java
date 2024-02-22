package com.embarkx.firstapp.job;

import com.embarkx.firstapp.company.Company;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private double minSalary;
    private double maxSalary;
    private String location;

    @ManyToOne
    private Company company;
}
