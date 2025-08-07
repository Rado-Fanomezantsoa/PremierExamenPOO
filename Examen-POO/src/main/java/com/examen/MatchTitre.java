package com.examen;

import java.util.List;

import static com.examen.TypeMatch.MatchPourTitre;

public class MatchTitre extends Match {
    private final TypeMatch typeMatch;

    public MatchTitre(String dateETLieu, long idMatch, List<Combattant> combattants,  TypeMatch typeMatch) {
        super(dateETLieu, idMatch, combattants);
        this.typeMatch = typeMatch;
    }
}
