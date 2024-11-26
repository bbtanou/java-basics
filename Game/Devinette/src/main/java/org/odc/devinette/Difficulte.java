package org.odc.devinette;

public class Difficulte {
    private Niveau niveau;
    private int min;
    private int max;
    private int limiteTentatives;

    public Difficulte(Niveau niveau){
        this.niveau = niveau;
        min = 1;
        switch (niveau){
            case FACILE:
                max = 10;
                limiteTentatives = 5;
                break;
            case MOYEN:
                max = 50;
                limiteTentatives = 7;
                break;
            case DIFFICILE:
                max = 100;
                limiteTentatives = 10;
        }
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getLimiteTentatives() {
        return limiteTentatives;
    }
}
