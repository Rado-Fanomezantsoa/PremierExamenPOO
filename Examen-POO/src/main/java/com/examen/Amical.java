package com.examen;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Amical extends Match {

    private final TypeMatch typeMatch;

    public Amical(String dateETLieu, long idMatch, List<Combattant> combattants, TypeMatch typeMatch) {
        super(dateETLieu, idMatch, combattants);
        this.typeMatch = typeMatch;
    }
}
