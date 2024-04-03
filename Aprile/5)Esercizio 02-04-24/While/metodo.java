import java.util.Scanner;

public class metodo {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dividendo;
        double divisore;
        System.out.println("Inserisci il primo numero");
        dividendo = scan.nextDouble();
        System.out.println("Inserisci il divisore");
        divisore=scan.nextDouble();
        divisore=controllo(divisore, scan);
        double risultato=divisione(dividendo, divisore);
        System.out.println(risultato);

    }

        //Controllo sull divisore 
    public static double controllo (double divisore,Scanner scan){
        while (divisore == (double)0){
            System.out.println("Errore non puo essere diviso per zero");
            divisore=scan.nextDouble();
        }
        return divisore;
    }


        //Metodo 
    public static double divisione(double dividendo, double divisore){
         double risultato=dividendo/divisore;
         return risultato;
    
        }


}

// public static double divisione(double dividendo, double divisore,Scanner scan){
//     while (divisore == (double)0) {
//             System.out.println("Errore non puo essere diviso per zero");
//             divisore=scan.nextDouble();
//     }
//           double risultato=dividendo/divisore;
//     return risultato;

//     }
  

    /* 
public static int Metodo1(int x,int y){
        
    int z=x+y;
    return z;
}

Basta dichiare la Scanner ()
public static int Metodo2(Scanner scan){
    System.out.println("Inserisci il primo numero");
    int x = scan.nextInt();
    System.out.println("Inserisci il primo numero");
    int y = scan.nextInt();
    int z=x+y;
    System.out.println(z);
    return z;

}
*/

