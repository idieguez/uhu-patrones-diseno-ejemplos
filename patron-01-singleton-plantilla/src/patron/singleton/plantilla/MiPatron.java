package patron.singleton.plantilla;




public final class MiPatron {
    
    // Atributo (del patrón Singleton).
    private static final MiPatron miPatron = new MiPatron();
    
    // Atributos (de la clase).
    private static int i;
    
    // Constructor.
    private MiPatron() {
        i = 0;
    }
    
    // Métodos.
    public static MiPatron getMiPatron() {
        i++;
        return miPatron;
    }
    
    public void mostrarVecesLlamado() {
        System.out.println("He sido llamado " + i + " veces.");
    }
    
}
