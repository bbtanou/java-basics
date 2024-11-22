package animal;

public abstract class Animal {
    String nom;
    String couleur;

    public Animal(String nom, String couleur){
        this.nom = nom;
        this.couleur = couleur;
    }

    public abstract void move();

    public void talk(){
        System.out.println(nom + " S'exprime");
    }
}
