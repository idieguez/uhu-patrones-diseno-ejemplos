package patron.facade.plantilla;




public class PatronFacadePlantilla {

    public static void main(String[] args) {
        
        /*
        I_Clase1 c1 = new Clase1();
        I_Clase2 c2 = new Clase2();
        I_Clase3 c3 = new Clase3();
        
        c1.operacion1();
        c2.operacion2();
        c3.operacion3();
        */
        
        
        I_Facade facade = new Facade();
        facade.realizarOperacionFacade();
        
        
    }
    
}
