package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor

public class Depence {
    private String description;
    private double montant;
    private Categorie categorie;
    private LocalDate date;
}
