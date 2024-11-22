package figure;

public class Triangle extends Figure{
    public double cote1;
    public double cote2;
    public double cote3;

    public Triangle(double cote1, double cote2, double cote3){
        super("Triangle", 3);
        this.cote1 = cote1;
        this.cote2 = cote2;
        this.cote3 = cote3;
    }


    @Override
    public void perimetre(){
        var p = cote1 + cote2 + cote3;
        System.out.println("Le perimetre du " + nom + " est: " + p);
    }

    @Override
    public void surface(){
        var semi = (cote1 + cote2 + cote3) / 2;
        var radical = (semi * (semi - cote1)* (semi - cote2) * (semi - cote3));
        var s = Math.sqrt(radical);

        System.out.println("La surface du "+ nom +" est: " + s);
    }
}
