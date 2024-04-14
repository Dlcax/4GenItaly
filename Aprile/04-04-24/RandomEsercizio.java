import java.util.Random;
import java.util.Scanner;

public class RandomEsercizio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean rigioca=true;
        System.out.println("Benvenuto ad INDOVINA IL Numero \n per Iniziare digita il numero");
        do {
            int numeroRandomico=RandomNumero(scan);
            System.out.print("Scegli il numero da indovinare");
            int numeroScelto=scan.nextInt(); 
            scan.nextLine();
            controllo(numeroRandomico, numeroScelto,scan);
            rigioca=again(rigioca, scan);
        } while (rigioca);
       

    }
    static boolean again(boolean rigioca,Scanner scan){
        System.out.println("Scrivi un altro numero per rigiocare altrimenti digita No per uscire");
        String risp=scan.nextLine();
        switch (risp) {
            case "no":
            System.out.println("Arrivederci");
                rigioca=false;
                break;
        }
        return rigioca;
    }


     static void controllo(int numeroCasuale,int numeroScelto,Scanner scan){
        if (numeroScelto<0 && numeroScelto>5) {
            while (numeroScelto<0 && numeroScelto>5) {
                System.out.println("Scegli un numero corretto");
                numeroScelto=scan.nextInt();
            }

            } else {
                    if(numeroScelto!=numeroCasuale){
                         System.out.println("Hai sbagliato il numero che avevo scelto è "+numeroCasuale);
                     }
                     else{
                         System.out.println("Hai Indovinato hai vinto la partita \n il numero che avevo scelto è "+numeroCasuale);
                     }
                 }    
    }


    public static int RandomNumero(Scanner scan){
        System.out.println("Scegli il numero che partirà da 0 a .....");
        int numeroRandomicoscelto=scan.nextInt();
        scan.nextLine();
        int numRandom=new Random().nextInt(numeroRandomicoscelto);
        //int numRandom=new Random().nextInt(5);
        return numRandom;
    }

}
