public class Session1 {
   public static void main(String[] args){
       //somme des int
//       int sumEntier = sumInt(3, 5);
//       System.out.println("La somme des entiers: " + sumEntier);
//
       //somme des float
       float sumFloat = sumFloat(5, 7.6f);
       System.out.println("La somme des floats est: " + sumFloat);

       //somme des double;
       double sumDouble = sumDouble(5, 90.8);
       System.out.println("La somme des doubles est: " + sumDouble);

       //somme des long
       long sumLong = sumLong(5, 34);
       System.out.println("La somme des long est: " + sumLong);
   }

   static int sumInt(int x, int y){
       return x + y;
   }

   static float sumFloat(float x, float y){
       return x + y;
   }

   static double sumDouble(double x, double y){
       return x + y;
   }
   static long sumLong(long x, long y){
       return x + y;
   }
}
