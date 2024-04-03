public class EsercizioDoWhile2 {

    public static void main(String[] args) {
        do {
            //variabile di partenza
            System.out.println("Inserisci la variabile di partenza");
            int a =scan.nextInt;

            if (a<=0){
                while (a<=0) {
                    System.out.print("Il numero deve essere superiore a 0");
                    a=scan.nextInt();
                    } 
            }


               //fine controllo
               else {
                System.out.println("Inserisci il secondo numero che limiterà il contatore");
                int b =scan.nextInt();
                if (b<=0){
                    while (b<=0) {
                        System.out.print("Il numero deve essere superiore a 0");
                        b=scan.nextInt();
                    } 
            }


                     
                    //fine controllo
                    System.out.print(a++);
            }
            while (a<b);
            System.out.println("Grazie buonagiornata");
        }
}