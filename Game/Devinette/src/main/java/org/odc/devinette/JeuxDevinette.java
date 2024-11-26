package org.odc.devinette;

import java.util.Random;
import java.util.Scanner;

public class JeuxDevinette implements Devinette{
    private final Scanner scanner = new Scanner(System.in);
    private int nombreMystere;
    private int limite;
    private int nombreTentative = 0;

    @Override
    public int genereNombre(Difficulte difficulte){
        Random random = new Random();
        return random.nextInt((difficulte.getMax() - difficulte.getMin()) + 1);
    }

    @Override
    public void deviner(Joueur joueur){
        Difficulte difficulte = getDifficulte();
        this.limite = difficulte.getLimiteTentatives();
        this.nombreMystere = genereNombre(difficulte);

        do {
            System.out.print("Deviner le nombre: ");
            int choix = scanner.nextInt();
            scanner.nextLine();
            if (choix == this.nombreMystere){
                joueur.setScore((joueur.getScore() + 10) - this.nombreTentative);
                this.nombreTentative = 0;
                System.out.println("Bravo vous avez trouvé.");
                System.out.println("Souhaitez-vous continuer ? oui/non");
                String reponse = scanner.nextLine();

                if (!reponse.equalsIgnoreCase("oui")){
                    System.out.println("Votre score est: " + joueur.getScore());
                    break;
                }

                this.nombreMystere = genereNombre(difficulte);
            }else{
                this.nombreTentative++;
                String message = choix > this.nombreMystere ? "Le nombre mystere est plus petit": "Le nombre mystere est plus grand";
                System.out.println(message);
            }
        }while (this.nombreTentative <= this.limite);

    }

    private Difficulte getDifficulte(){
        System.out.println("Choisissez la difficulté: ");
        System.out.println("1 -  Facile");
        System.out.println("2 -  Moyen");
        System.out.println("3 -  Difficile");

        int choix = scanner.nextInt();
        scanner.nextLine();

        Niveau niveau = switch(choix){
            case 2 -> Niveau.MOYEN;
            case 3 -> Niveau.DIFFICILE;
            default -> Niveau.FACILE;
        };

        return new Difficulte(niveau);
    }


}
