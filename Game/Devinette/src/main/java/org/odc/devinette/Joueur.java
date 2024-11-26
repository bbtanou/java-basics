package org.odc.devinette;

public class Joueur {
    private String name;
    private int score;
    public static int nombreJoeur = 0;

    public Joueur(String name){
        Joueur.nombreJoeur++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
