package patron.facade.plantilla;




public class Facade implements I_Facade {
    
    private I_Clase1 c1;
    private I_Clase2 c2;
    private I_Clase3 c3;
    
    Facade() {
        c1 = new Clase1();
        c2 = new Clase2();
        c3 = new Clase3();
    }
    
    @Override
    public void realizarOperacionFacade() {
        
        System.out.println("Operaciones de clase desde Facade.");
        System.out.println("Realizo las adaptaciones previas pertinentes.");
        
        // Realizo las llamadas.
        c1.operacion1();
        c2.operacion2();
        c3.operacion3();
        
        System.out.println("Realizo las adaptaciones posteriores pertinentes.");
        
    }
    
    
    
}
