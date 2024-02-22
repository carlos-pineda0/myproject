package com.embarkx.firstapp.review;

import com.embarkx.firstapp.company.Company;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private double rating;

    @ManyToOne
    private Company company;

}
