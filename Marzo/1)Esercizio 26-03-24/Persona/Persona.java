import java.util.Scanner;
public class Persona{
 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Inserisci il nome"); 
		String nome=scan.nextLine(); //prendi il nome
		System.out.println("Inserisci il cognome");
		String Cognome=scan.nextLine(); //prendi il cognome
		System.out.println("Inserisci l'eta");
		int eta=scan.nextInt(); //prendi l'eta

		//output dati
		
		System.out.println("i tuoi dati sono "+ nome+ " " + Cognome+ " " + eta );
	}
}