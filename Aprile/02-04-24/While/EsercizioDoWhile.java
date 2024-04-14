import java.util.Scanner;

public class EsercizioDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //richiesta  Numero di partenza
        System.out.println("Inserisci il numero di partenza");
        int numP=scan.nextInt();

        System.out.print("Inserisci il limitatore");
        int limit = scan.nextInt();
        //variabile limit


        //check  se il numero è <=0 errore
        if (numP <=0 ){
            while (numP <=0 ) {
                System.out.println("Si deve imputare un numero maggiore di 0");
                System.out.println("inserisci un numero valido");
                limit=scan.nextInt();
            }
        }
        else {
            System.out.println("Incremento in corso attendere...");
            do {
                System.out.println(numP++);
            }
            while(numP <limit);
        }
        System.out.println("Grazie per avermi usato");
    }
}

/*differenza do while qui la variabile la puoi dichiarare all'iterno
 * int a;
 * 
 * 
		do {
			System.out.println("Digitare un numero: ");
			a = scanner.nextInt();
			if ( a <=0 ){
				System.out.println("Si deve inputare un numero maggiore di 0");
			}
		}while(a<=0);
			
		differenza while
qui si presuma che il valore c'e l'ha  
		int a = 0;
		while(a<=0) {
			System.out.println("Digitare un numero: ");
			a = scanner.nextInt();
			if ( a <=0 ){
				System.out.println("Si deve inputare un numero maggiore di 0");
			}
		}
 */
