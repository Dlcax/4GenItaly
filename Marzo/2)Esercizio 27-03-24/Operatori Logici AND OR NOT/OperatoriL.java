import java.util.Scanner;

public class OperatoriL{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci la prima variabile (Inserisci true o false)");
        boolean a = scan.nextBoolean();
        System.out.println("Inserisci la secodna variabile  (Inserisci true o false)");
        boolean b = scan.nextBoolean();

        System.out.print("Hai scelto "+a + " "+b);

        //condizione AND
        boolean c = a&&b;
        System.out.println("IL RISULTATO AND SARA " + c);
        //CONDIZIONE OR
        boolean d = a||b;
        System.out.println("IL RISULTATO OR SARA  " + d);
        //CONDIZIONE NOT 1
        boolean e = !a;
        System.out.println("IL RISULTATO NOT DI A " + e);
        //CONDIZIONE NOT 2
        boolean f = !b;
        System.out.println("IL RISULTATO NOT DI B  " + f);

        scan.close();

    }
}