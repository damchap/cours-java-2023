package fr.damchap.model;

import java.util.ArrayList;

public class Etudiant {

    private String matricule;

    private String nom;

    private ArrayList<Matiere> matieres;

    public Etudiant(String matricule, String nom, ArrayList<Matiere> matieres) {
        this.matricule = matricule;
        this.nom = nom;
        this.matieres = matieres;
    }

    public Etudiant() {

    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(ArrayList<Matiere> matieres) {
        this.matieres = matieres;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", matieres=" + matieres +
                '}';
    }
}
