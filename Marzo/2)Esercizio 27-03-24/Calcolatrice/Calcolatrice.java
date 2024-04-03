import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inserisci il primo numero");
        float a = scan.nextFloat();
        System.out.println("Inserisci il secondo numero");
        float b = scan.nextFloat();
        float ris=a+b;

        System.out.println("il risultato è "+ ris );
    }
}