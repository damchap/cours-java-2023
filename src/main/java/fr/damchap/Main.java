package fr.damchap;

import fr.damchap.model.Etudiant;
import fr.damchap.model.Matiere;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Matiere matiere1 = new Matiere(1, "Java", 2, 10);
        Matiere matiere2 = new Matiere(2, "C#", 2, 12);
        Matiere matiere3 = new Matiere(3, "PHP", 2, 14);
        Matiere matiere4 = new Matiere(4, "Python", 2, 16);
        Matiere matiere5 = new Matiere(5, "C++", 2, 18);

        // liste des matières
        ArrayList<Matiere> matieres = new ArrayList<>();
        matieres.add(matiere1);
        matieres.add(matiere2);
        matieres.add(matiere3);
        matieres.add(matiere4);
        matieres.add(matiere5);


        Etudiant etudiant = new Etudiant(1, "Damien", matieres);

        System.out.println(etudiant.toString());


    }
}
