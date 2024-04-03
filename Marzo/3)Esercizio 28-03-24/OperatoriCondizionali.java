import java.util.Scanner;

public class OperatoriCondizionali {
    public static void main(String[] args) {
        
        /*Creare una classe EsercizioIf con un metodo main, che:
          riceva in input da console due numeri interi (chiedendo prima all’utente l’inserimento per ciascuno dei due) 
          se il secondo numero è zero stampi a video il messaggio non si può dividere per zero
           solo se entrambi i numeri sono positivi e se il secondo è minore o uguale al primo effettui la divisione dei due numeri e stampi a video il risultato
          alla fine, stampare un messaggio programma terminato
        */

        Scanner scan =new Scanner(System.in);
           
        System.out.println("Inserisci il primo numero");
            int x =scan.nextInt();
            System.out.println("Inserisci il secondo  numero");
            int y =scan.nextInt();

            if(y==0){
                System.out.println("Impossibile dividere per zero");
            }
            else if (x>0 && y>0 && y<=x){
                int c=x/y;
                System.out.println("Il risultato della divisione è "+ c);

            }
            else {
                System.out.println("errore");
            }


            scan.close();
            System.out.println("programma terminato");
    }
}