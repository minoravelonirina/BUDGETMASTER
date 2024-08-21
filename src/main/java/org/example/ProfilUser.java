package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor

public class ProfilUser {
    private String userName;
    private double BudgetMensual;
    private List<Depence> depenes;
}
