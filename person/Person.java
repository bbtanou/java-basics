package person;

public class Person {
    private String nom;
    private String prenom;
    private int age;

    public Person(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Person(){
        nom = "";
        prenom = "";
    };

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public int getAge(){
        return age;
    }

    public void info(){
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Age: " + age);
    }
}
