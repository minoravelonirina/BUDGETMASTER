package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

@Getter
@Setter
@AllArgsConstructor

public class User {
    private String userName;
    private double BudgetMensual;
    private List<Depence> depenes;


    public void addExpense(Depence newDepence){
        getDepenes().add(newDepence);
    }

    public List<Depence> getExpenseByCategory(String categorie){
        getDepenes()
                .stream()
                .filter(e -> !categorie.equals(e.getCategorie()));
        return List.of();
    }

    public double getTotalSpentThisMonth(){
        double acc = 0.0;
        LocalDate currentDate = LocalDate.now();
        int month = currentDate.getMonthValue();

        for (Depence depene : getDepenes()) {
            if (depene.getDate().getMonthValue() == month){
                acc += depene.getMontant();
            }
        }
        return acc;
    }
}
