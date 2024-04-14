package LettoreDvd;

import java.util.Scanner;

public class PortaDisco {

	Disco disco1;
	Disco disco2;
	Disco disco3;
	Disco disco4;
	
	
	public PortaDisco() {
		disco1=null;
		disco2=null;
		disco3=null;
		disco4=null;
	}
	
	
	public  Disco CreazioneOggetto () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci le informazioni");
		System.out.println("Inserisci il titolo");
		String titolo = scan.nextLine();
		System.out.println("Inserisci la piattaforma");
		String piattaforma=scan.nextLine();
		System.out.println("Inserisci l'autore");
		String autore = scan.nextLine();
		System.out.println("Inserisci anno di pubblicazione");
		int anno =scan.nextInt();
		scan.nextLine();
		System.out.println("Inserisci la durata");
		int durata=scan.nextInt();
		scan.nextLine();
		if (durata==0) {
		return new Disco(titolo, piattaforma, autore, anno);
		}
		else {
			return new Disco(titolo, piattaforma, autore, anno,durata);
		}
	}
	

	public boolean isDiscoCreato(Disco disco) {
		if (disco==null) {
			return false;
		}
		else {
			return true;
		}
	}
	

	public void userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cosa vuoi fare ?");
		System.out.println("1=Crea Disco|| 2=Inserisci \n ||3= rimuovi disco");
		int risposta=scan.nextInt();
		
		switch (risposta) {
		case 1:
			if (!isDiscoCreato(disco1)) {
					disco1=CreazioneOggetto();
			}
			if (!isDiscoCreato(disco2)) {
					disco2=CreazioneOggetto();
			}
			if (!isDiscoCreato(disco3)) {
				 	disco3=CreazioneOggetto();
			}
			if (!isDiscoCreato(disco4)) {
					disco4=CreazioneOggetto();
			}
			if(isPortaDiscoPieno()) {
				System.out.println("Porta dischi pieno");
			}
			break;
		case 2:
			if (disco1 !=null && disco2!=null&& disco3 !=null && disco4!=null) {
				System.out.println(disco1.ToString());
				System.out.println(disco2.ToString());
				System.out.println(disco3.ToString());
				System.out.println(disco4.ToString());
				
			}
			break;
		case 3:
			eliminaDisco();
		}
		System.out.println("Vuoi ripetere l'operazione?");

		boolean ripeti=scan.nextBoolean();
		
		//RICORSIONE creare dei cicli di codice piu adeguati
		// si attiva solo se la condizione è rispettata
		if(ripeti) {
			userInput();
		}
		
	}
	
	public boolean isPortaDiscoPieno() {
		if (disco1 !=null && disco2!=null&& disco3 !=null && disco4!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void eliminaDisco() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quale disco vuoi eliminare?");
		int scelta=scan.nextInt();

			switch (scelta) {
			case 1:
				disco1 =null;
				System.out.println("Disco eliminato");
				break;
			case 2:
				disco2 =null;
				System.out.println("Disco eliminato");
				break;
			case 3:
				disco3 =null;
				System.out.println("Disco eliminato");
				break;
			case 4:
				disco4=null;
				System.out.println("Disco eliminato");
				break;
			case 5:
				disco1=null;
				disco2=null;
				disco3=null;
				disco4=null;
				System.out.println("TUTTI I DISCI SONO STATI ELIMINATI");
				break;
			default: 
				System.out.println("scelta errata");
			}
		
	}
}