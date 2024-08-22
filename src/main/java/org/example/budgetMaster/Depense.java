package org.example.budgetMaster;

import lombok.*;
//import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
//@ToString
@EqualsAndHashCode
@AllArgsConstructor

public class Depense {
    private String description;
    private double montant;
    private Categorie categorie;
    private LocalDate date;

    @Override
    public String toString() {
        return "Depense de categorie " + categorie + ", de montant de " + montant + ", a la date " + date;
    }
}
