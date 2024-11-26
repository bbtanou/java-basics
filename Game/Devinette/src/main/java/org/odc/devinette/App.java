package org.odc.devinette;

import javax.swing.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class App {
    public static void main( String[] args ) {
        Joueur a = new Joueur("A");
        Joueur b = new Joueur("B");

        System.out.println(Joueur.nombreJoeur);
    }
}
