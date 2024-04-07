package fr.amu.iut.exercice6;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Dico {

    private final ArrayList<String> listeMots;

    public Dico() {
        listeMots = new ArrayList<>();
        InputStream streamDico = getClass().getResourceAsStream("/exercice6/dico");
        String mot;
        try {
            assert streamDico != null;
            try (BufferedReader lecteur = new BufferedReader(new InputStreamReader(streamDico))) {
                while ((mot = lecteur.readLine()) != null) {
                    listeMots.add(mot);
                }
            }
        } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier : " + e.getMessage());
        }
    }
    public String getMot() {
        Random random = new Random();
        int numMotChoisi = random.nextInt(listeMots.size());
        return listeMots.get(numMotChoisi);
    }

    public ArrayList<Integer> getPositions(char lettre, String mot) {
        ArrayList<Integer> listePositions = new ArrayList<>();
        for (int index = 0; index < mot.length(); index++) {
            if (mot.charAt(index) == lettre) {
                listePositions.add(index);
            }
        }
        return listePositions;
    }
}
