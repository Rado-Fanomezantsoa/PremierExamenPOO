package com.examen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Ligue {
    private String nom;
    private List<Combattant> combattantsLigue;
}
