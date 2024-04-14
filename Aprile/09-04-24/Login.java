import java.util.Scanner;

public class Login {

	public Username utente;
	
	public void registrazione() {
		Scanner scan = new Scanner (System.in);
		
		while (true) {
			System.out.println("Inserisci il nome Utente");
			String username =scan.nextLine();
			System.out.println("Inserisci la password");
			String password= scan.nextLine();
			if (username.length()<4 && password.length()<4) {
				System.out.println("Inserisci piu di 4 caratteri");
				System.out.println("Inserisci Username");
				username=scan.nextLine();
				System.out.println("Inserisci password");
				password=scan.nextLine();	
			}
			else {
				utente =new Username(username,password);
				System.out.println("Utente Registrato gg");
				break;
			}
			//fine ciclo
		}
	}
	
	
	
	public void login () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci il nome Utente");
		String username =scan.nextLine();
		System.out.println("Inserisci la password");
		String password= scan.nextLine();
		if(utente.getUsername().equals(username) && utente.getPassword().equals(password)) {
			System.out.println("Accesso eseguito");
			return;
		}
		else {
			System.out.println("Dati errati");
		}
	}
	
	public void logout() {
		System.out.println("Loggato con successo");
	}
	
	
	
	
}
