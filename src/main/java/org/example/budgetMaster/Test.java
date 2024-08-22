package org.example.budgetMaster;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        
        Depense nourriture1 = new Depense("Depenses pour les nourritures mensuels", 50000.0, Categorie.NOURRITURE, LocalDate.of(2024, 8, 27));
        Depense transport1 = new Depense("Depenses pour les transports en commun chaque mois", 40000.0, Categorie.TRANSPORT, LocalDate.of(2024, 8, 27));
        Depense divertissement1 = new Depense("Depenses pour quelque divertissements dans en un mois", 50000.0, Categorie.DIVERTISSEMENT, LocalDate.of(2024, 8, 27));
        Depense servicesPublics1 = new Depense("Depenses pour les services publics et communautaire", 20000.0, Categorie.SERVICES_PUBLICS, LocalDate.of(2024, 8, 27));
        Depense autre1 = new Depense("Depenses pour les maladies ou soins", 60000.0, Categorie.AUTRE, LocalDate.of(2024, 8, 27));
        Depense nourriture2 = new Depense("Depenses pour les nourritures mensuels", 50000.0, Categorie.NOURRITURE, LocalDate.of(2024, 2, 27));
        Depense transport2 = new Depense("Depenses pour les transports en commun chaque mois", 50000.0, Categorie.TRANSPORT, LocalDate.of(2024, 2, 27));
        Depense divertissement2 = new Depense("Depenses pour quelque divertissements dans en un mois", 50000.0, Categorie.DIVERTISSEMENT, LocalDate.of(2024, 2, 27));
        Depense servicesPublics2 = new Depense("Depenses pour les services publics et communautaire", 30000.0, Categorie.NOURRITURE, LocalDate.of(2024, 2, 27));
        Depense autre2 = new Depense("Depenses pour les maladies ou soins", 70000.0, Categorie.AUTRE, LocalDate.of(2024, 2, 27));
        Depense nourriture3 = new Depense("Depenses pour les nourritures mensuels", 50000.0, Categorie.NOURRITURE, LocalDate.of(2024, 3, 27));
        Depense transport3 = new Depense("Depenses pour les transports en commun chaque mois", 40000.0, Categorie.TRANSPORT, LocalDate.of(2024, 3, 27));
        Depense divertissement3 = new Depense("Depenses pour quelque divertissements dans en un mois", 50000.0, Categorie.DIVERTISSEMENT, LocalDate.of(2024, 3, 27));
        Depense servicesPublics3 = new Depense("Depenses pour les services publics et communautaire", 20000.0, Categorie.NOURRITURE, LocalDate.of(2024, 3, 27));
        Depense autre3 = new Depense("Depenses pour les maladies ou soins", 60000.0, Categorie.AUTRE, LocalDate.of(2024, 3, 27));

        ArrayList<Depense> depencesList = new ArrayList<>();
        depencesList.add(servicesPublics1);
        depencesList.add(nourriture1);
        depencesList.add(transport1);
        depencesList.add(autre1);
        depencesList.add(servicesPublics2);
        depencesList.add(nourriture2);
        depencesList.add(transport2);
        depencesList.add(autre2);
        depencesList.add(servicesPublics3);
        depencesList.add(nourriture3);
        depencesList.add(transport3);
        depencesList.add(autre3);
        depencesList.add(divertissement2);
        depencesList.add(divertissement3);

        User mino = new User("Minosoa", 400000.0, new ArrayList<>());

        System.out.println("Le nombre des depenses dans la liste avant insertion est : " + mino.getDepenses().size());
        mino.addExpense(depencesList);
        mino.addExpense(divertissement1);
        System.out.println("Le nombre des depences dans la liste apres insertion est : " + mino.getDepenses().size());
        System.out.println("--------------------------");

        System.out.println("La liste des depenses sans la categorie nourriture : ");
        ArrayList<Depense> list = mino.getExpenseByCategory(Categorie.NOURRITURE);
        for (Depense depense : list) {
            System.out.println(depense);
        }
        System.out.println("---------------------------");

        mino.alertUser();
        System.out.println("---------------------------");

        System.out.println("Le reste du budget du mois en court est : " + mino.getRemainingBudget());
        System.out.println("---------------------------");

        System.out.println("Voici les top categorie : ");
        for (int i = 0; i<=2; i++){
            System.out.println(mino.getTopCategories().get(i).getCategorie());
        }
        System.out.println("----------------------------");
        mino.calculateAverageSpendingPerCategory();
    }
}
