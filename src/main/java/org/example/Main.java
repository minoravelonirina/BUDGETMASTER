package org.example;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Depence nourriture1 = new Depence("Depence pour les nourritures mensuels", 50000.0, Categorie.NOURRITURE, LocalDate.of(2024, 1, 27));
        Depence transport1 = new Depence("Depence pour les transports en commun chaque mois", 40000.0, Categorie.TRANSPORT, LocalDate.of(2024, 1, 27));
        Depence divertissement1 = new Depence("Depence pour quelque divertissements dans en un mois", 50000.0, Categorie.DIVERTISSEMENT, LocalDate.of(2024, 1, 27));
        Depence servicesPublics1 = new Depence("Depenses pour les services publics et communautaire", 20000.0, Categorie.NOURRITURE, LocalDate.of(2024, 1, 27));
        Depence autre1 = new Depence("Depence pour les nourritures mensuels", 60000.0, Categorie.AUTRE, LocalDate.of(2024, 1, 27));
        Depence nourriture2 = new Depence("Depence pour les nourritures mensuels", 50000.0, Categorie.NOURRITURE, LocalDate.of(2024, 2, 27));
        Depence transport2 = new Depence("Depence pour les transports en commun chaque mois", 50000.0, Categorie.TRANSPORT, LocalDate.of(2024, 2, 27));
        Depence divertissement2 = new Depence("Depence pour quelque divertissements dans en un mois", 50000.0, Categorie.DIVERTISSEMENT, LocalDate.of(2024, 2, 27));
        Depence servicesPublics2 = new Depence("Depenses pour les services publics et communautaire", 30000.0, Categorie.NOURRITURE, LocalDate.of(2024, 2, 27));
        Depence autre2 = new Depence("Depence pour les nourritures mensuels", 70000.0, Categorie.AUTRE, LocalDate.of(2024, 2, 27));
        Depence nourriture3 = new Depence("Depence pour les nourritures mensuels", 50000.0, Categorie.NOURRITURE, LocalDate.of(2024, 3, 27));
        Depence transport3 = new Depence("Depence pour les transports en commun chaque mois", 40000.0, Categorie.TRANSPORT, LocalDate.of(2024, 3, 27));
        Depence divertissement3 = new Depence("Depence pour quelque divertissements dans en un mois", 50000.0, Categorie.DIVERTISSEMENT, LocalDate.of(2024, 3, 27));
        Depence servicesPublics3 = new Depence("Depenses pour les services publics et communautaire", 20000.0, Categorie.NOURRITURE, LocalDate.of(2024, 3, 27));
        Depence autre3 = new Depence("Depence pour les nourritures mensuels", 60000.0, Categorie.AUTRE, LocalDate.of(2024, 3, 27));
        User mino = new User("Minosoa", 400000.0, List.of(nourriture1, nourriture2, transport2, transport1, divertissement1, divertissement2, servicesPublics1, servicesPublics2, autre1, autre2));
        System.out.println(mino.getTotalSpentThisMonth());
    }
}