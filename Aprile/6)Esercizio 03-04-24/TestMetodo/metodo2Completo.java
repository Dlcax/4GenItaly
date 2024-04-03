import java.util.Scanner;
public class metodo2 {

    public static void main(String[] args) {
       
        Scanner scan=new Scanner(System.in);
        System.out.println("iniziamo");
        boolean continua=true;
        do {
            continua=true;
            int a;
            int b;
            int risultato;
            String risp;
            System.out.println("inserisci il primo numero");
            a=scan.nextInt();
            scan.nextLine();
            System.out.println("Inserisci il secondo numero");
            b =scan.nextInt();
            scan.nextLine();
            risultato=confronta(a,b);


            switch (risultato){
                case 1: System.out.println("il primo numero è minore del secondo "+risultato);
                break;
                case -1: System.out.println("il secondo numero è minore del secondo "+risultato);
                break;
                default :System.out.println("uguali "+risultato);
            }

            System.out.println("vuoi continuare? scrivi no se vuoi chiudere");
            risp=scan.nextLine();
            switch (risp) {
                case "no":
                    continua=false;
                    break;
                default:
                    break;
            }
        }
        while (continua);
    } 
        


    public static int confronta (int a , int b){
        if (a<b){
            return -1;
        }
        else if (a>b){
            return 1;
        }
            return 0;  
    }

}


