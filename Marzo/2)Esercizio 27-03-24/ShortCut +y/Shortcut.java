import java.util.Scanner;

public class Shortcut{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y =10;
        System.out.println("Inserisci il numero che vuoi increamntare di 10");
        int x =scan.nextInt();
        System.out.println("Il numero scelto è "+ x);
        x+=y;
        System.out.print("Il numero è stato incrementato il risultato è "+ x);
        scan.close();
    }
}