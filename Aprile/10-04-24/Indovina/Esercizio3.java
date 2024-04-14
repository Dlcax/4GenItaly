import java.util.Random;
import java.util.Scanner;
public class Esercizio3{
        
 public static int GeneraNumero(){
    Random random = new Random();
    int numeroCasuale = random.nextInt(50);
    System.out.println(numeroCasuale);
    return numeroCasuale;
 }

public static int scegliNumero(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Inserisci il numero");
    int indovinaNumero=scan.nextInt();
    scan.close();
    return indovinaNumero;
    

}
    
public static void controllo(int indovinaNumero,int numeroCasuale){
    if (numeroCasuale>indovinaNumero){
        System.out.println("Il numero è che hai scelto "+numeroCasuale+" maggiore "+indovinaNumero);
    }
    else if (indovinaNumero==numeroCasuale){
            System.out.println("Il numero è che hai scelto \n"+numeroCasuale+"uguale "+indovinaNumero);
    }
    else{
            System.out.println("Il numero è che hai scelto \n"+numeroCasuale+" minore "+indovinaNumero);
    }
}


}