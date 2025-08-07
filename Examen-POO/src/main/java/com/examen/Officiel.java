package com.examen;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Officiel extends Match {
        private final TypeMatch typeMatch;

    public Officiel(String dateETLieu, long idMatch, List<Combattant> combattants, TypeMatch typeMatch) {
        super(dateETLieu, idMatch, combattants);
        this.typeMatch = typeMatch;
    }
}
