package LettoreDvd;

public class Disco {
	
	public String titolo;
	public String piattaforma;
	public String autore;
	public int annoDiPubblicazione;
	public int durata;
	public final int  id;
	public static int incrementoID=0;
	
	//LIBRO
	public Disco(String titolo, String piattaforma, String autore, int annoDiPubblicazione) {
		super();
		this.titolo = titolo;
		this.piattaforma = piattaforma;
		this.autore = autore;
		this.annoDiPubblicazione = annoDiPubblicazione;
		id = ++incrementoID;
	}
	
	public String ToString() {
		if(durata ==0) {
			return titolo+piattaforma+autore+annoDiPubblicazione;
		}
		else {
			return  titolo+piattaforma+autore+annoDiPubblicazione+durata;
		}
	}
	

	//FILM O CANZONI
	public Disco(String titolo, String piattaforma, String autore, int annoDiPubblicazione, int durata) {
		super();
		this.titolo = titolo;
		this.piattaforma = piattaforma;
		this.autore = autore;
		this.annoDiPubblicazione = annoDiPubblicazione;
		this.durata = durata;
		id = ++incrementoID;
	}
	 
	
	
	
	

}
