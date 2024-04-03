import java.util.Scanner;

public class Esempio2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final float f = 12.3f;
		// f = 14.6f; errore perchè f Final

		final boolean b ;
		b=false;
		//b=true;
		System.out.println("Inserisci un numero");
		int num=scan.nextInt();
		System.out.println("Hai inserito "+ num);
		scan.close();

	}
}