import java.util.Scanner;

public class EsercizioWhile {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        //Inserisci il primo  numero
        System.out.println("inserisci il primo numero");
        int a=scan.nextInt();
        //Svolgiamo il controllo
        if (a<=0){
            while (a<=0) {
                System.out.println("Inserisci un numero valido");
                a=scan.nextInt();
            }
        } 
        //se il controllo passa 
        System.out.print("Inserisci il secondo numero");
         int b=scan.nextInt();
            if (b >=0){
                while (b<=0){
                System.out.println("Inserisci un numero valido");
                b=scan.nextInt();
                }
            }
            //controlla se il limitatore è piu piccolo dell'incremento
            if (b >a){
                while (b >= a){
                    System.out.println("A DEVE ESSERE MAGGIORE DI B");
                    a=scan.nextInt();
                }
            }
            //fine controllo 
            System.out.println("Calcolo in corso");
            int c=0; //variabile contatore
            if (c<=a) {
                while (c <=a){
                    System.out.print(c+"-");
                    c=c+b;
                }
            }
                else {
                    System.out.println("termina programma");
            }   
            scan.close();
    }
}