package figure;

public class Cercle extends Figure{
    double rayon;

    public Cercle(double rayon){
        super("Cercle", 0);
        this.rayon = rayon;
    }

    @Override
    public void perimetre(){
        var p = 2 * this.rayon * Math.PI;
        System.out.println("Le perimetre du "+ nom +"est: " + p);
    }

    @Override
    public void surface(){
        var r = rayon * rayon * Math.PI;
        System.out.println("Le surface du " + nom + " est: " + r);
    }
}
