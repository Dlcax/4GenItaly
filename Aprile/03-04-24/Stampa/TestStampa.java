import java.util.Scanner;

public class TestStampa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soglia;
        int incremento;
        boolean condition =true;
        do {
             condition = true;
            System.out.println("Inserisci la soglia");
            soglia=scan.nextInt();
            scan.nextLine();
            System.out.println("Inserisci l'incremento");
            incremento=scan.nextInt();
            scan.nextLine();
            Stampa(soglia, incremento, scan);


            System.out.println("Premi 0 se vuoi uscire altrimenti inserisci dei nuovo numeri");
            int flag=scan.nextInt();
            switch (flag) {
                case 0:
                    condition=false;
                    break;
            }
        } while (condition);
           
            
    }

    static void Stampa(int soglia,int incremento,Scanner scan){     
            if (soglia<=0){
            while (soglia<=0){
                System.out.println("Errore inserire un numero corretto");
                System.out.println("inserisci la soglia");
                soglia=scan.nextInt();
            }
        }
            else if (incremento<=0){
                while (incremento<=0) {
                    System.out.println("Errore inserire un numero corretto");
                    System.out.println("inserisci incremento");
                    incremento=scan.nextInt();
                }
            }
            else {
                for(int i =0; i<soglia ; i+=incremento){
                    if(incremento>soglia){
                        while (incremento>soglia) {
                            System.out.println("Errore l'incremento deve essere piu piccolo");
                            System.out.println("Inserisci il nuovo incremento");
                        incremento=scan.nextInt();
                        }
                    }
                    else{
                        System.out.println(i);
                    }
                }
            }

            

    }
}
    // static void controllo (Scanner scan){
    //     if (incremento <=0 && soglia <= 0){
    //         System.out.println("Inserisci due numeri superiori a 0");
    //         System.out.println("Incremento");
    //         incremento=scan.nextInt();
    //         System.out.println("Soglia");
    //         soglia=scan.nextInt();
    //     }
    // }


    // static void controllo (int soglia , int incremento,Scanner scan){
    //     while (soglia <=0) {
    //         System.out.println("Inserisci un numero superiore allo 0");
    //         System.out.println("Re-inserisci la soglia");
    //         soglia=scan.nextInt();
    //     }
    //     while(incremento<=0){
    //         System.out.println("Inserisci un numero superiore allo 0");
    //         System.out.println("Re-inserisci la soglia");
    //         soglia=scan.nextInt();
    //     }
    // }