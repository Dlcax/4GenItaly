public class provaMetodo {
	public static void main(String[] args) {
		int a ;
		a=somma(1,2);


	}
}

/* 
      //firma
static  void metdo1(){ //intestazione
 
	//blocco d'istruzioni
		//NON RITORNANO NULLA
}

static int metodo2(){
	//blocco d'istruzioni
	//Possono ritornare un valore;
	//ritornare valore si usa RETURN
}
*/

/* 
----> Definizione del metodo  public void....
public void metodo3 {
	int x = 3*5;
	System.out.println(" Il valore di x è :" + x);
	//metodo senza retun
	}
	
public int metodo 4 (){
	
		---> invocazione int x = 3*5;
		System.out.println(" Il valore di x è :" + x);
		
		
}
*/

static int somma(int x, int y) {
	System.out.println(" ricevuti in ingresso " + x + " e " + y);
	int z = x + y;
	System.out.println(" il risultato è " + z);
	return z;
	}
	