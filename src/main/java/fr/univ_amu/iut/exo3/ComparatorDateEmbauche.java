package fr.univ_amu.iut.exo3;

import fr.univ_amu.iut.exo1.Employe;
import fr.univ_amu.iut.exo1.Entreprise;
import fr.univ_amu.iut.exo1.GestionEntreprises;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparatorDateEmbauche implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        LocalDate date1 = e1.getDateEmbauche();
        LocalDate date2 = e2.getDateEmbauche();
        return date1.compareTo(date2);
    }


}

