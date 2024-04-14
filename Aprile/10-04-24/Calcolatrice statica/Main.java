import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci 4 numeri");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        int num4=scan.nextInt();

        System.out.println("Il risultato della somma è"+CalcolatriceStatica.somma(num1, num2, num3, num4));
        System.out.println();
        System.out.println("Il risultato della somma è"+CalcolatriceStatica.sottazione(num1, num2, num3, num4));
        System.out.println();
        System.out.println("Il risultato della somma è"+CalcolatriceStatica.minore(num1, num2, num3, num4));
        System.out.println();
        System.out.println("Il risultato della somma è"+CalcolatriceStatica.maggiore(num1, num2, num3, num4));
    }
}