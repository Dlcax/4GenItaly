import java.util.Scanner;

public class EsercizioBreakeContinue {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.println("Inserisci il primo numero");
            a=scan.nextInt();
            if (a<=0){
                System.out.println("Il numero deve essere maggiore di 0");
            }
        }
        while (a <=0);

        
        do {
            System.out.print("inserisci il secondo numero");
            b=scan.nextInt();
            if(b>=a){
                System.out.println("Si deve inputare un numero minore di a"); 
            }
        }
        while (b>=a);

        for (int i =0; i <=a; i++){
            if (i==b){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("Programma eseguito correttamente ");
    }
}