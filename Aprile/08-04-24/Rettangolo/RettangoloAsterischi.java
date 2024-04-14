import java.util.Scanner;

public class RettangoloAsterischi{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci l'altezza");
        int altezzaR = scan.nextInt();

        System.out.println("Inserisci la base ");
        int base = scan.nextInt();

        for (int i = 0; i < altezzaR; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altezzaR - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scan.close();
    }
}
