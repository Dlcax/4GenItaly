import java.util.Scanner;

public class Item {
    //LE CARATTERISTICHE DELL'OGGETTO. //QUINDI SONO VARIABILI DI DEFAULT;
    public String description="Camicia";
    public String color="blue";
    public char size='L';
    public double price=10.0;
    public Item


    //METODO COSTRUTTORE INIZIALIZZA (CREA )L'OGGETTO  
    public Item(String description){
        this.description=description;
    }

    public void caratteristicheOggetto(){
        System.out.println("L'item selezionato è :");
        System.out.println();
        System.out.println("Descrizione "+description+" colore: "+color+" Taglia "+ size+ "prezzo "+price);        
    }


    public void Oggetto(Scanner sc){
        System.out.println("Descrizione oggetto");        
        description=sc.nextLine();
        System.out.println("colore"); 
        color=sc.nextLine();
        System.out.println("taglia"); 
        size=sc.next().charAt(size);
        System.out.println("prezzo"); 
        price=sc.nextDouble();
        System.out.println("Descrizione "+description+" colore: "+color+" Taglia "+ size+ "prezzo "+price);        
        

    }

}