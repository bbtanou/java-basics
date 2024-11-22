package figure;

public class Rectangle extends Figure{
    public double longueure;
    public double largeur;
    
    public Rectangle(double longueure, double largeur){
        super("Rectangle", 4);
        this.longueure = longueure;
        this.largeur = largeur;
    }

    @Override
    public void perimetre(){
        var p = (longueure + largeur) * 2;
        System.out.println("Le perimetre du "+ nom +" est: " + p);
    }

    @Override
    public void surface(){
        var s = longueure * largeur;
        System.out.println("La surface du "+ nom +" est: " + s);
    }
}
