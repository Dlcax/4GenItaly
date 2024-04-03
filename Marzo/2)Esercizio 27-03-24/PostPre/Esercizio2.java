import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variabile da tracciare
        System.out.print("Inserisci il numero ");
        int x =scan.nextInt();
        //post incremento
        System.out.println("Il numero selezionato è "+ x++);
       //post incremento eseguito
        System.out.println("Risultato post incremento " + x);

        //si esegue il pre incremento
        System.out.println("Adesso eseguo il pre-incremento la x vale in questo momento "+ ++x);
        System.out.println("Il numero pre-incrementato è "+ x);


    }
}