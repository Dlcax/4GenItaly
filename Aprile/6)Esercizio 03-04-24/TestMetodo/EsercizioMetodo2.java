import java.util.Scanner;

public class metodo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Inserisci il primo numero");
        int a=scan.nextInt();
        System.out.println("Inserisci il Secondo numero");
        int b=scan.nextInt();
        int z=confronta(a,b);


        Systyem.out.println(z);



    }




    static int Confronta (int a , int b){
        if (a<b){
           int risultatoA= -1;
            
        }
        else if (a==b){
            int RisultatoA=0;
            
        }
        else {
            int  RisultatoA=1;
            
        }
        return risultato;
    }
}