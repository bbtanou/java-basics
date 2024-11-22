package animal;

public class Oiseau extends Animal{
    public Oiseau(String nom, String couleur){
        super(nom, couleur);
    }

    @Override
    public void move() {
        System.out.println(nom + " Vole");
    }

    @Override
    public void talk() {
        System.out.println(nom + " Chante");        
    }
}
