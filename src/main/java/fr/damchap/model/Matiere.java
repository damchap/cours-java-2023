package fr.damchap.model;

public class Matiere {

    private int idMatiere;
    private String titre;
    private int coefficient;

    private int note;

    public Matiere(int idMatiere, String titre, int coefficient, int note) {
        this.idMatiere = idMatiere;
        this.titre = titre;
        this.coefficient = coefficient;
        this.note = note;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "matiere{" +
                "idMatiere=" + idMatiere +
                ", titre='" + titre + '\'' +
                ", coefficient=" + coefficient +
                ", note=" + note +
                '}';
    }
}
