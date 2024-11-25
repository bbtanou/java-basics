package com.odc.menu.view;

import java.util.List;
import java.util.Scanner;

import com.odc.menu.controller.ChienController;
import com.odc.menu.model.Chien;
public class ChienView {
    private final Scanner sc = new Scanner(System.in);
    private final ChienController controller = new ChienController();
    
    public void add(){
        System.out.print("Donnez le nom: ");
        String nom = sc.nextLine();
        
        System.out.print("Donnez la taille: ");
        double taille = sc.nextDouble();
        sc.nextLine();

        System.out.print("Donnez la couleur: ");
        String couleur = sc.nextLine();

        controller.create(nom, taille, couleur);
    }

    public void afficher(){
        System.out.println();
        System.out.println("**** LISTE DES CHIENS ****");
        List<Chien> chiens = controller.getAll();
        for(Chien chien: chiens){
            System.out.println(chien);
        }
        System.out.println();
    }
}
