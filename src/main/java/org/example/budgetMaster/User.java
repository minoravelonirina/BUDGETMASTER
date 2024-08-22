package org.example.budgetMaster;

import lombok.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public void alertUser(){
        if (getTotalSpentThisMonth() >= getBudgetMensual()){
            System.out.println("Votre depense depasse votre budget mensuel");
        }
        System.out.println("La total des depense du mois en court est : " + getTotalSpentThisMonth());
    }

    public double getRemainingBudget(){
        return getBudgetMensual() - getTotalSpentThisMonth() ;
    }

    public ArrayList<Depense> getTopCategories(){
        ArrayList<Depense> listOfDepense = new ArrayList<>();
        listOfDepense.addAll(getDepensesInThisMonth());
        Collections.sort(listOfDepense, Comparator.comparing(Depense::getMontant).reversed());
        return listOfDepense;
    }

    public void calculateAverageSpendingPerCategory(){
        System.out.println("Moyenne nourriture : "+ getAvarageOfCategorieNourriture());
        System.out.println("Moyenne transport : "+ getAvarageOfCategorieTrasport());
        System.out.println("Moyenne service public : "+ getAvarageOfCategorieServicesPublic());
        System.out.println("Moyenne divertissement : "+ getAvarageOfCategorieDivertissement());
        System.out.println("Moyenne autre : "+ getAvarageOfCategorieAutre());
    }

    public double getAvarageOfCategorieNourriture(){
        List<Depense> nourriture = depenses.stream()
                .filter(depense -> depense.getCategorie().equals(Categorie.NOURRITURE))
                .collect(Collectors.toList());

        double total = nourriture.stream()
                .mapToDouble(Depense::getMontant)
                .sum();
        return Math.floor(total / nourriture.size());
    }
    public double getAvarageOfCategorieTrasport(){
        List<Depense> transport = depenses.stream()
                .filter(depense -> depense.getCategorie().equals(Categorie.TRANSPORT))
                .collect(Collectors.toList());

        double total = transport.stream()
                .mapToDouble(Depense::getMontant)
                .sum();
        return Math.floor(total / transport.size());
    }
    public double getAvarageOfCategorieServicesPublic(){
        List<Depense> servicePunlic = depenses.stream()
                .filter(depense -> depense.getCategorie().equals(Categorie.SERVICES_PUBLICS))
                .collect(Collectors.toList());

        double total = servicePunlic.stream()
                .mapToDouble(Depense::getMontant)
                .sum();
        return Math.floor(total / servicePunlic.size());
    }
    public double getAvarageOfCategorieDivertissement(){
        List<Depense> divertissement = depenses.stream()
                .filter(depense -> depense.getCategorie().equals(Categorie.DIVERTISSEMENT))
                .collect(Collectors.toList());

        double total = divertissement.stream()
                .mapToDouble(Depense::getMontant)
                .sum();
        return Math.floor(total / divertissement.size());
    }
    public double getAvarageOfCategorieAutre(){
        List<Depense> autre = depenses.stream()
                .filter(depense -> depense.getCategorie().equals(Categorie.AUTRE))
                .collect(Collectors.toList());

        double total = autre.stream()
                .mapToDouble(Depense::getMontant)
                .sum();
        return Math.floor(total / autre.size());
    }
}
