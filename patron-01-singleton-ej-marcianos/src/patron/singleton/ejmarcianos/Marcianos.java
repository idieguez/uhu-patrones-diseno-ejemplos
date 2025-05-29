package patron.singleton.ejmarcianos;




public final class Marcianos {
    
    // Atributos.
    private static final Marcianos marcianos = new Marcianos();
    private static int numMarcianos;
    
    // Constructor.
    private Marcianos() {
        numMarcianos = 10;
    }
    
    // Getters y Setters.
    public static Marcianos getMarcianos() {
        return marcianos;
    }
    
    public int getNumMarcianos() {
        return numMarcianos;
    }
    
    // Métodos.
    public void matarMarcianos(int numMarcianosMatados) {
        
        if (numMarcianos < numMarcianosMatados) {
            numMarcianos = 0;
        } else {
            numMarcianos = numMarcianos - numMarcianosMatados;
        }
        
        System.out.println("Has matado " + numMarcianosMatados + " marcianos.");
        mostrarNumMarcianos();
        
    }
    
    public void crearMarcianos(int numMarcianosCreados) {
        
        // Sólo se pueden crear marcianos si aún existe al menos uno (así se pueden reproducir).
        if (numMarcianos > 0) {
            numMarcianos = numMarcianos + numMarcianosCreados;
        }
        
        System.out.println("Se han creado " + numMarcianosCreados + " marcianos nuevos.");
        mostrarNumMarcianos();
        
    }
    
    public void mostrarNumMarcianos() {
        System.out.println("Quedan " + numMarcianos + " marcianos vivos.");
    }
    
}
