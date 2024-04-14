public class Main {
    public static void main(String[] args) {
    int tentativi =3;
    
        do {
             Esercizio3.controllo(Esercizio3.GeneraNumero(),Esercizio3.scegliNumero());


            tentativi--;
        } while (tentativi<1);

       
    }
}
