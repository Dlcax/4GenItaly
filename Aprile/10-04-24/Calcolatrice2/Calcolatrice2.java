import java.util.Scanner;

public class Calcolatrice2{

    public static int somma (int num1,int num2){
        return num1+num2;

    }

    public static int sottrazione (int num1,int num2){
        return num1-num2;

    }
    public static int moltiplicazione (int num1,int num2){
        return num1*num2;

    }
    public static int divisione (int num1,int num2){
        return num1/num2;

    }
    
    // public static String controllo(){
    //     System.out.println("Vuoi rifare un altro calcolo?");
    //     Scanner scan=new Scanner(System.in);
    //     String scelta2=scan.nextLine();
    //     do {
    //     switch (scelta2) {
    //         case "si":
    //             System.out.println("Fai una nuova scelta");
    //             scelta=scan.nextLine();
    //             break;
        
    //         case "no":
    //             System.out.println("Arrivederci ToxicPlayer");
    //             break;
    //         default:
    //             break;
    //     }
    // } while (scelta2.equals("si")|| scelta2.equals("no"));
    // scan.close();
    // }
}