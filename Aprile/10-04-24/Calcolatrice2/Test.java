import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int num2;
        boolean flags=true;
            int scelta;
            int tentativi=3;
            
            do {
                System.out.println("Scegli cosa vuoi fare \n 1=somma | 2=sottrazione \n 3=moltiplicazione |4=divisione");
                 scelta=scan.nextInt();
                switch (scelta) {
                    case 1:          
                  System.out.println("Inserisci 2 numeri");
                         num =scan.nextInt();
                         num2=scan.nextInt();
                        System.out.println("Il risultato è "+Calcolatrice2.somma(num, num2));
                        System.out.println("vuoi rifare il calcolo?");
                        flags=scan.nextBoolean();
                        break;
                    case 2:
                     System.out.println("Inserisci 2 numeri");
                         num =scan.nextInt();
                         num2=scan.nextInt();
                        System.out.println("Il risultato è "+Calcolatrice2.sottrazione(num, num2));
                        System.out.println("vuoi rifare il calcolo?");
                        flags=scan.nextBoolean();
                        break;
                    case 3:
                        System.out.println("Inserisci 2 numeri");
                        num =scan.nextInt();
                        num2=scan.nextInt();
                        System.out.println("Il risultato è "+Calcolatrice2.moltiplicazione(num, num2));
                        System.out.println("vuoi rifare il calcolo?");
                        flags=scan.nextBoolean();
                        break;
                    case 4:
                        System.out.println("Inserisci 2 numeri");
                        num =scan.nextInt();
                        num2=scan.nextInt();
                        System.out.println("vuoi rifare il calcolo?");
                        flags=scan.nextBoolean();
                        break;
                    default:
                        System.out.println("Inserisci un valore corretto");
                        scelta=scan.nextInt();
                        System.out.println("Hai "+" "+tentativi+" tentativi");
                        System.out.println();
                        System.out.println("Scegli cosa vuoi fare \n 1=somma | 2=sottrazione \n 3=moltiplicazione |4=divisione");
                        --tentativi;
                            break;
                    }


                
                    if (tentativi==0){
                        System.out.println("HAI FINITO I TENTATIVI ");
                        flags=false;
                    }
                } while (flags);

                if (tentativi==0){
                    System.out.println("HAI FINITO I TENTATIVI ");
                    flags=false;
                }
                
    }
}