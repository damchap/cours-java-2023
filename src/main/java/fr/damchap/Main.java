package fr.damchap;

import fr.damchap.model.Etudiant;
import fr.damchap.model.Matiere;

import java.util.ArrayList;
import java.util.Scanner;

import static fr.damchap.controller.EtudiantController.*;

public class Main {
    public static void main(String[] args) {

        // menu pour creer un utilisateur et l'afficher
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        while (choix < 4) {


            // demander a l'utilisateur
            System.out.println("Bonjour, veuillez choisir une option");
            System.out.println("1. Créer un étudiant");
            System.out.println("3. Afficher les étudiants");
            System.out.println("4. Quitter");

            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    creerEtudiant();
                    break;
                case 3:
                    afficherEtudiants();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Veuillez saisir un choix valide");
                    break;
            }
        }



    }
}
