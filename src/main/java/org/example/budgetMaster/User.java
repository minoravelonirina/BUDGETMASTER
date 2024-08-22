package org.example.budgetMaster;

import lombok.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class User {
    private String userName;
    private double budgetMensual;
    private ArrayList<Depense> depenses = new ArrayList<>();

    public void addExpense(ArrayList<Depense> depencesList){
        for (Depense depense : depencesList) {
            this.getDepenses().add(depense);
        }
    }

    public void addExpense(Depense depense){
        this.getDepenses().add(depense);
    }

    public ArrayList<Depense> getExpenseByCategory(Categorie categorie) {
        ArrayList<Depense> newList = new ArrayList<>();
        for (Depense depense : getDepenses()) {
            if (!depense.getCategorie().equals(categorie)) {
                newList.add(depense);
            }
        }
        Collections.sort(newList, Comparator.comparing(Depense::getCategorie));
        return newList;
    }

    public ArrayList<Depense> getDepensesInThisMonth(){
        LocalDate currentDate = LocalDate.now();
        Month month = currentDate.getMonth();
        return (ArrayList<Depense>) getDepenses()
                .stream()
                .filter(depense -> depense.getDate().getMonth().equals(month))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public double getTotalSpentThisMonth(){
        double acc = 0;
        for (Depense depense : getDepensesInThisMonth()) {
            acc += depense.getMontant();
        }
        return acc;
    }

}
