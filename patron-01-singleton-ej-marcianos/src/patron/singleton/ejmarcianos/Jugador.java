package patron.singleton.ejmarcianos;

import java.util.Random;




public class Jugador {
    
    // Atributos.
    private Marcianos marcianos;
    
    // Constructor.
    public Jugador() {
        marcianos = Marcianos.getMarcianos();
    }
    
    // Métodos.
    public void matarMarcianos(int numDisparosRealizados) {
        
        Random random = new Random();
        int numMarcianosMatados = random.nextInt(numDisparosRealizados);        // Devuelve un entero aleatorio entre 0 y numDisparosRealizados.
        marcianos.matarMarcianos(numMarcianosMatados);
        
    }
    
}
