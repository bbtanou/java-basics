package figure;

public abstract class Figure {
    public String nom;
    public int nombreCote;

    public Figure(String nom, int nombreCote){
        this.nom = nom;
        this.nombreCote = nombreCote;
    }

    public abstract void perimetre();
    public abstract void surface();
}
