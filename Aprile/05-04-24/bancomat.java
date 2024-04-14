import java.util.Scanner;

public class Bancomat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean ripeti;

       
        System.out.println("Benvenuto Inserisci il tuo saldo");
        int saldoContabile=scan.nextInt();
        ripeti=true;
        System.out.println("Fai una scelta");
        do {
        System.out.println("Digita 0 per uscire|1 per prelevare | 2 per versamento|");
        int scelta =scan.nextInt();
        controllo(scelta, scan);
       

        switch (scelta) {
            case 0:
                System.out.println("Arrivederci e grazie");
                ripeti=false;
                break;
            case 1:
                System.out.println("digita il prelievo");
                saldoContabile=prelievoControllo(saldoContabile, scan);
                System.out.println("Il tuo saldo attuale è "+saldoContabile);
                again(ripeti, scan);
                break;
            case 2:
                System.out.println("digita il versamento");
                 saldoContabile=versamento(saldoContabile, scan);
                 System.out.println("Il tuo saldo attuale è "+saldoContabile);
                 again(ripeti, scan);
                break;
        }

        } while (ripeti);
        


    }

    public static int controllo(int scelta,Scanner scan){
      if (scelta <0 || scelta >2){
           System.out.println("Errore !!! Inserisci 0=Esci|1=Preleva|2=Versamento");
           scelta=scan.nextInt();
      }
      
        return scelta;
    }


    public static int versamento (int saldoContabile,Scanner scan){
        
        System.out.println("Inserisci quanto vuoi depositare ");
        int versamento=scan.nextInt();
        int totale = saldoContabile+versamento;
        return totale;
    }


    public static int prelievoControllo (int saldoContabile,Scanner scan){
        int prelievo;
            System.out.println("Inserisci quanto vuoi prelevare");
            prelievo=scan.nextInt();
            scan.nextLine();
            if (prelievo > saldoContabile){
                while (prelievo > saldoContabile) {
                    System.out.println("non puoi prelevare piu del tuo saldo");
                    prelievo=scan.nextInt();
                }
            }
                   saldoContabile-=prelievo;
            
            return saldoContabile;

    }

    public static boolean again(boolean ripeti,Scanner scan){
        System.out.println("vuoi fare altre operazioni?");
        System.out.println("True = si | false = no");
        ripeti=scan.nextBoolean();
        return ripeti;


    }


}