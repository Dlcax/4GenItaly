import java.util.Scanner;

public class PostPre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* qui verrà eseguito il pre incremento  */
        System.out.println("Scrivi il numero per per pre-incrementarlo");
        int pre=scan.nextInt();
        System.out.println("Attualemente è "+ pre);
        System.out.println("Il numero è "+ ++pre);

        /*Qui verrà eseguito il post incremento */
        System.out.println("Scrivi il numero da post-incrementare");
        int post=scan.nextInt();
        System.out.println("Il numero attualmente è "+ post++ );
        System.out.println("Adesso è "+ post);

        scan.close();
    }
    //pre incremento
    
}