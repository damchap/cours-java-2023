package fr.damchap.controller;

import fr.damchap.model.Etudiant;
import fr.damchap.model.Matiere;

import java.util.ArrayList;
import java.util.Scanner;

public class EtudiantController {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Etudiant> etudiants = new ArrayList<>();
    public static void creerEtudiant() {
        Etudiant etudiant = new Etudiant();
        System.out.println("Veuillez saisir le matricule de l'étudiant");
        etudiant.setMatricule(sc.next());
        System.out.println("Veuillez saisir le nom de l'étudiant");
        etudiant.setNom(sc.next());
        System.out.println("Veuillez saisir le nombre de note de l'étudiant");
        int nbNotes = sc.nextInt();
        ArrayList<Matiere> matieres = new ArrayList<>();
        int i= 0;
        while (i < nbNotes) {
            Matiere m = new Matiere();

            System.out.println("Veuillez saisir la note de la matière ");
            m.setNote(sc.nextInt());

            System.out.println("Veuillez saisir le non de la matière ");
            String nomMatiere = sc.next();
            m.setTitre(nomMatiere);

            System.out.println("Veuillez saisir le coefficient de la matière ");
            m.setCoefficient(sc.nextInt());
            matieres.add(m);
            i++;
        }
        etudiant.setMatieres(matieres);
        etudiants.add(etudiant);
    }
    public static void afficherEtudiants() {
        System.out.println("Affichage des étudiants");

        for (Etudiant etudiant : etudiants) {
            System.out.println("matricule : " +etudiant.getMatricule());
            System.out.println("non de l'étudiant : " +etudiant.getNom());
            double moyenne = 0;
            for (Matiere matiere : etudiant.getMatieres()) {
                System.out.println("matière : " +matiere.getTitre());
                System.out.println("note : " +matiere.getNote());
                System.out.println("coefficient : " +matiere.getCoefficient());
                moyenne += matiere.getNote() * matiere.getCoefficient();
                moyenne = moyenne / 20;
            }
            System.out.println("moyenne : " +moyenne);

        }

    }
}
