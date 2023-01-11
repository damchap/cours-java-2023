<h1 align='center'>📘 Cours Java 2023</h1>

<p align="center">
<a>
</a>
</p>


<p align="center">
ce cours est un cours de java pour les débutants et les personnes qui veulent apprendre le java
</p>

<p align="center">
<table>
<tbody>
<td align="center">
<img width="800" height="0" /><br>
<i>Status:</i> Early Access</b> <br>
<sup> Please report any issues 🐛</sup><br>
<sub>Made possible by my <a href="https://github.com/sponsors/damchap">Sponsor Program 💖</a>
</td>
</tbody>
</table>
</p>

## 📚 Table des matières

- [📚 Table des matières](#-table-des-matières)
- [📖 Introduction](#-introduction)
- [📖 Cours debuté sur la navigabilité des objets en java](#-cours-debuté-sur-la-navigabilité-des-objets-en-java)
  - [📖 objet Matiere](#-objet-matiere)
  - [📖 objet Etudiant](#-objet-etudiant)
  - [📒 Diagrame de classe](#-diagrame-de-classe)
- 

## 📖 Introduction

Ce cours est un cours de java pour les débutants et les personnes qui veulent apprendre le Java

<!-- cours 1 -->

## 📖 Cours debuté sur la navigabilité des objets en java

### 🗂️ objet Matiere
Créer un objet Matiere avec comment parametre

- titre
- coefficient
- note

### 🧑‍💻 objet Etudiant
Créer un objet Etudiant avec comment parametre 

- idEtudiant
- nom
- Matiere

### 📒 Diagrame de classe
``` mermaid
classDiagram

    class Etudiant {
      + Etudiant(int, String, ArrayList~Matiere~) 
      - String nom
      - int idEtudiant
      - ArrayList~Matiere~ matieres
      + setIdEtudiant(int) void
      + getNom() String
      + getIdEtudiant() int
      + setNom(String) void
      + getMatieres() ArrayList~Matiere~
      + toString() String
      + setMatieres(ArrayList~Matiere~) void
    }
    class Matiere {
      + Matiere(int, String, int, int) 
      - int note
      - int idMatiere
      - String titre
      - int coefficient
      + getTitre() String
      + setCoefficient(int) void
      + setIdMatiere(int) void
      + setTitre(String) void
      + toString() String
      + setNote(int) void
      + getCoefficient() int
      + getIdMatiere() int
      + getNote() int
    }

Etudiant "1" *--> "matieres *" Matiere 


``` 
## PEX 11 janvier 2023

### LIVRABLES:
     Un PDF précisant le binôme.
      Un zip contenant les 3 classes Appli, Eleve et Matiere.

### PARTIE 1:
1. dmder nom élève, matricule, nb notes à saisir
2. faire boucle "donner titre, coef, note"
3. faire moyenne des notes saisies

Matière n° 1
     
    Titre : ____
     Coef. : ____
     Note  : ____
Matière n° 2
     
    Titre : ____
(...)

### PARTIE 2:
1. maintenant on a +ieurs élèves
2. ajouter une sur-boucle: pour chaque élève, faire boucle "donner titre, coef, note" + moyenne de l'élève
3. classer (Z-A) par moyenne des élèves

## 📝 License

MIT © [Damien Chapart](https://damienchapart.fr) 2023
