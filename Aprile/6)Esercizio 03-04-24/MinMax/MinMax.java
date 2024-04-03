import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int risultato;
        Scanner scan=new Scanner(System.in);

        System.out.println("Per partecipare al gioco dovrai inserire tre valori");
        System.out.println("Primo valore");
        int a=scan.nextInt();
        System.out.println("secondo valore");
        int b=scan.nextInt();
        System.out.println("Terzo Valore");
        int c=scan.nextInt();

        System.out.println("Ora dovrai dirmi true o false");
        System.err.println("Se scegli true ti darà il massimo false il minimo");
        boolean controllo=scan.nextBoolean();

        risultato=MinMax(controllo, a, b, c);
        System.out.println(risultato);
}




public static int MinMax(boolean controllo,int a,int b,int c){

    int num=0;
    if(controllo){
        if (a>c && a>b){
            num =a;
        }
        else if (b>a && b>c){
            num=b;
        }
        else {
            num=c;
        }

    }
    else if (!controllo){
        if (a<b && a<c) {
            num =a;
        }
        else if(b<a && b<c){
            num=b;
        }
        else {
            num=c;
        }

    }
    return num;
}
}
