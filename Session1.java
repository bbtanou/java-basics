import java.util.Scanner;

public class Session1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez l'operation que vous voulez");
        System.out.println("1 - Somme");
        System.out.println("2 - Soustraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        int choix = scanner.nextInt();
        
        switch (choix) {
            case 1:
                System.out.println("Donner le premier nombre");
                int a = scanner.nextInt();
                System.out.println("Donner le deuxieme nombre");
                int b = scanner.nextInt();
                int sum = calculSomme(a, b);
                System.out.println("La somme est: " + sum);
                break;
            case 2:
                System.out.println("Donner le premier nombre");
                int x = scanner.nextInt();
                System.out.println("Donner le deuxieme nombre");
                int y = scanner.nextInt();
                int subs = calculSoustraction(x, y);
                System.out.println("La resultat est: " + subs);
            case 3:
                System.out.println("Donner le premier nombre");
                int c = scanner.nextInt();
                System.out.println("Donner le deuxieme nombre");
                int d = scanner.nextInt();
                int mult = calculProduit(c, d);
                System.out.println("Le resultat est: " + mult);
            case 4:
                System.out.println("Donner le premier nombre");
                int t = scanner.nextInt();
                System.out.println("Donner le deuxieme nombre");
                int f = scanner.nextInt();
                int div = calculDivision(t, f);
                System.out.println("Le resultat est: " + div);
            default:
                System.out.println("Vous devez donner un nombre entre 1, 2, 3, 4");
                break;
        }

    }


    static int calculSomme(int a, int b){
        return a + b;
    }

    static int calculSoustraction(int a, int b){
        return a - b;
    }

    static int calculProduit(int a, int b){
        return a * b;
    }

    static int calculDivision(int a, int b){
        return a / b;
    }

}
