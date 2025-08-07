package com.examen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Combattant {
    private String idCombattant;
    private String nom;
    private String prenom;
    private String nomDeCombattant;
    private String poids;
    private List<Titre> titresCombattant;
    private int points;

    public Combattant(String idCombattant, String nom, String prenom, String nomDeCombattant, String poids, List<Titre> titresCombattant, int points) {
        this.idCombattant = idCombattant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDeCombattant = nomDeCombattant;
        this.poids = poids;
        this.titresCombattant = titresCombattant;
        this.points = points;
    }

    public Combattant(String idCombattant, String nom, String prenom, String nomDeCombattant, String poids, int points) {
        this.idCombattant = idCombattant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDeCombattant = nomDeCombattant;
        this.poids = poids;
        this.points = points;
    }
}
