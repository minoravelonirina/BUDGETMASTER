package org.example.budgetMaster;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

public class Depense {
    private String description;
    private double montant;
    private Categorie categorie;
    private LocalDate date;
}
