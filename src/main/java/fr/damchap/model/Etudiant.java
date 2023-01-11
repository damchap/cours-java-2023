package fr.damchap.model;

import java.util.ArrayList;

public class Etudiant {

    private int idEtudiant;

    private String nom;

    private ArrayList<Matiere> matieres;

    public Etudiant(int idEtudiant, String nom, ArrayList<Matiere> matieres) {
        this.idEtudiant = idEtudiant;
        this.nom = nom;
        this.matieres = matieres;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
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
        return "etudiant{" +
                "idEtudiant=" + idEtudiant +
                ", nom='" + nom + '\'' +
                ", matieres=" + matieres +
                '}';
    }
}
