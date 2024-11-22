package animal;

public class Chien extends Animal{
    public Chien(String nom, String couleur){
        super(nom, couleur);
    }

    @Override
    public void move() {
        System.out.println(nom + " Marche avec ses quatre patte");
    }

    @Override
    public void talk() {
        System.out.println(nom + " Aboie");
    }

    public void hunt(){
        System.out.println(this.nom + " est entrain de chasser");
    }
}
