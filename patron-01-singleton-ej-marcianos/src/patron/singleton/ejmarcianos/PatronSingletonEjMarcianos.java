package patron.singleton.ejmarcianos;

import java.util.Scanner;




public class PatronSingletonEjMarcianos {

    public static void main(String[] args) {
        
        int numDisparos;
        Scanner scanner = new Scanner(System.in);
        
        Marcianos marcianos = Marcianos.getMarcianos();
        Ordenador ordenador = new Ordenador();
        Jugador jugador = new Jugador();
        
        System.out.println("Inicio del juego.");
        
        do {
            
            System.out.print("Disparos a realizar: ");
            numDisparos = scanner.nextInt();
            jugador.matarMarcianos(numDisparos);
            ordenador.crearMarcianos();
            
        } while (numDisparos != 0 && marcianos.getNumMarcianos() > 0);
        
        scanner.close();
        
        System.out.println("Fin del juego.");
        
    }
    
}
