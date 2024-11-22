public class Calculatrice {
    double x;
    double y;

    Calculatrice(double x, double y){
        this.x = x;
        this.y = y;
    }

    double sum(){
       return x + y;
    }

    double sub(){
        return x -y;
    }

    double multiply(){
        return x * y;
    }

    double divide(){
        return x / y;
    }

    void result(){
        System.out.println("La somme est: " + sum());
        System.out.println("La difference est: " + sub());
        System.out.println("La multiplication est: " + multiply());
        System.out.println("La division est: " + divide());
    }
}