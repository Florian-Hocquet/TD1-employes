package fr.univ_amu.iut.exo3;

import fr.univ_amu.iut.exo2.Commercial;
import fr.univ_amu.iut.exo2.EmployeOrdinaire;
import fr.univ_amu.iut.exo2.Representant;

import fr.univ_amu.iut.exo1.Employe;
import fr.univ_amu.iut.exo1.Entreprise;

import java.time.LocalDate;
import java.time.Month;
import java.util.PriorityQueue;


public class GestionEntreprises {
    public static void main(String[] args) {
        PriorityQueue<Employe> priorityQueue = new PriorityQueue<>(new ComparatorDateEmbauche());

        Commercial cmc = new Commercial(12345, "THE", "2020", 1, LocalDate.of(2000, Month.AUGUST, 26), LocalDate.of(2020, Month.DECEMBER, 20), 22, 45, 12000, 2);

        EmployeOrdinaire eO = new EmployeOrdinaire(12345, "THE", "2019", 1, LocalDate.of(2000, Month.AUGUST, 26), LocalDate.of(2019, Month.JUNE, 20), 22, 45);

        Representant rpz = new Representant(12345, "THE", "2018", 1, LocalDate.of(2000, Month.AUGUST, 26), LocalDate.of(2018, Month.OCTOBER, 20), 22, 45, 12000, 2);

        priorityQueue.add(cmc);
        priorityQueue.add(eO);
        priorityQueue.add(rpz);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove().getPrenom());
        }

    }
        //throw new RuntimeException("Not yet implemented !");
}