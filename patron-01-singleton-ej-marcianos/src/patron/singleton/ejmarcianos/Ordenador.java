package patron.singleton.ejmarcianos;

import java.util.Random;




public class Ordenador {
    
    // Atributos.
    private Marcianos marcianos;
    
    // Constructor.
    public Ordenador() {
        marcianos = Marcianos.getMarcianos();
    }
    
    // Métodos.
    public void crearMarcianos() {
        
        Random random = new Random();
        int numMarcianosCreados = random.nextInt(10);
        marcianos.crearMarcianos(numMarcianosCreados);
        
    }
    
}
