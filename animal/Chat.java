package animal;
public class Chat extends Animal{
    public Chat(String nom, String couleur){
        super(nom, couleur);
    }

    @Override
    public void move() {
        System.out.println(nom + " Marche avec ses quatre patte");
    }

    @Override
    public void talk() {
        System.out.println(nom + " Miole");        
    }
}
