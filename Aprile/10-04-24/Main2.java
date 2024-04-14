import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Inserisci 2 numeri");
            int num =scan.nextInt();
            int num2=scan.nextInt();
            System.out.println("Scegli cosa vuoi fare \n 1=somma | 2=sottrazione \n 3=moltiplicazione |4=divisione");
            int scelta=scan.nextInt();
            do {
                switch (scelta) {
                    case 1:
                        System.out.println("Il risultato è "+Calcolatrice2.somma(num, num2));
                        break;
                    case 2:
                        System.out.println("Il risultato è "+Calcolatrice2.sottrazione(num, num2));
                        break;
                    case 3:
                        System.out.println("Il risultato è "+Calcolatrice2.moltiplicazione(num, num2));
                        break;
                    case 4:
                        System.out.println("Il risultato è "+Calcolatrice2.divisione(num, num2));
                        break;
                
                    default:
                        break;
                }
            } while (scelta <1 && scelta >4);
    }
}