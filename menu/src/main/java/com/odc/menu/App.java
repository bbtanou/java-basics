package com.odc.menu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.odc.menu.view.ChienView;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        List<Integer> nombrePaires = new ArrayList<>();
        Set<Integer> nombreImpaires = new HashSet<>();

        for(int i = 1; i <= 20; i++){
            if (i % 2 == 0) {
                nombrePaires.add(i);
            }else{
                nombreImpaires.add(i);
            }
        }
        System.out.println();
        nombreImpaires.forEach(n -> System.out.printf("%d,", n));

        System.out.println();
        nombrePaires.forEach(n -> System.out.printf("%d,", n));
        System.out.println();
    }
}
