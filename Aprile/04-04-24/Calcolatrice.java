import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        benvenuto();
        System.out.println("Scegli un operatore");
        int scelta=sceltaOperando(scan);
        Controllo(scan,scelta);

        System.out.println("scegli tre numeri");
        int a=scan.nextInt();
        int b=scan.nextInt();

        operando(scan, scelta,a,b);
    }


    /*
     * Cosa da migliorare Scelta operando inutile
     * Operando ho lasciato i metodi 
     * Scanner non lo uso
     */


    //Messaggio di Benvenuto
    public static void benvenuto(){
        System.out.println("Benvenuto Nella calcolatrice");
        System.out.println("Scegli un operazione che vuoi eseguire");
        System.out.println("1=somma|2=sottrazione|3=moltiplicazione|4=divisione ");
    }
    //Controllo se scelta è <1 oppure >5
    public static int Controllo (Scanner scan,int scelta){
        System.out.println("operatore è "+ scelta);
        if(scelta <1 || scelta >4){
            while (scelta <1 ||scelta >4) {
                System.out.println("Dammi un numero corretto");
                scelta=scan.nextInt();
             }
         }  
         return scelta;
        
    }

    public static int sceltaOperando (Scanner scan){
        int scelta=scan.nextInt();
        return scelta;
    }
    //
    public static void operando(Scanner scan,int scelta,int a,int b){

        switch (scelta) {
            case 1:
                System.out.println(somma(a,b));
                break;
            case 2:
                System.out.println(sottrazione(a,b));
                break;
            case 3:
                System.out.println(moltiplicazione(a,b));
                break;
            case 4:
                System.out.println(divisione(a,b));
                break;
            default:
                break;
        }
    }

    //vari calcoli
    public static int somma(int a,int b){
        int somma=a+b;
        return somma;
    }

    public static int sottrazione(int a,int b){
        int sottrazione=a-b;
        return sottrazione;
    }
    
    public static int moltiplicazione(int a,int b){
        int moltiplicazione=a*b;
        return moltiplicazione;
    }

    public static int divisione(int a,int b){
        int divisione=a/b;
        return divisione;
    }

}