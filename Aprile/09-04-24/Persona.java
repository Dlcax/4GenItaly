import java.util.Scanner;

public class Persona {

	String nome;
	String cognome;
	int eta;
	
	
	public Persona () {
		
		
	}
	
	public void canta () {
		System.out.println("Pecché te voglio bene voglio a tte\r\n"
				+ "Pecché tu pure 'o ssaie faie pe' me\r\n"
				+ "Pecché cumanne 'o core rind'e me");
	}
	
	public void parla() {
		System.out.println("Ciao mario ora ti canto una canzone NAPOLETANA");
		
	}
	
	public void presentati() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci il nome");
		nome=scan.nextLine();
		System.out.println("Inserisci il cognome");
		cognome=scan.nextLine();
		System.out.println("Inserisci l'eta");
		eta=scan.nextInt();
		System.out.print("Piacere mi chiamo "+nome+" "+cognome+" Ho ben"+eta+"\n");
	}
	public void interagisci() {
		System.out.println("Ciao è un piacere conoscerti");
		
	}
	
	
}
