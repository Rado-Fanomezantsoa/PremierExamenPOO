package com.examen;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Match {
    private long idMatch;
    private String DateETLieu;
    private List<Combattant> combattants;


    public Match(String dateETLieu, long idMatch, List<Combattant> combattants) {
        DateETLieu = dateETLieu;
        this.idMatch = idMatch;
        this.combattants = combattants;
    }

    public boolean finish(Match match, boolean estTerminer) {
        if (estTerminer == true) {
            System.out.println("Le match "+ match.getIdMatch() + " est terminer");
        }
        return estTerminer;

    }


}
