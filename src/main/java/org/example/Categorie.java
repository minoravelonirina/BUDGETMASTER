package org.example;

public enum Categorie {
    NOURRITURE("Nourriture"),
    TRANSPORT("Transport"),
    DIVERTISSEMENT("Divertissement"),
    SERVICES_PUBLICS("Services publics"),
    AUTRE("Autre");

    private String categorie;

    Categorie(String categorie){
        this.categorie = categorie;
    }
}
