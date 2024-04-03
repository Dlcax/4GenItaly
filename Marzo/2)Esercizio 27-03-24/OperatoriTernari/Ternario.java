import java.util.Scanner;

public class Ternario{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il primo numero");
        int a =scan.nextInt();
        System.out.println("inserisci il secondo numero ");
        int b =scan.nextInt();

        //operatore ternario
        String s= (a >= b) ? "a maggiore o ugale a b" : "B è maggiore di A";

        System.out.println(s);

    }
}