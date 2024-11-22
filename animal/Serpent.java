package animal;

public class Serpent extends Animal{

    public Serpent(String nom, String couleur){
        super(nom, couleur);
    }

    @Override
    public void move() {
      System.out.println(nom + " Rampe");
    }

    @Override
    public void talk() {
        System.out.println(nom + " S'exprime");
    }
    
}
