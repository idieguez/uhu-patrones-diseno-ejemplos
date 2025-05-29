package patron.prototype.plantilla;




public class Prototype_Plantilla {
	
    public static void main(String[] args) {
    	
        Prototipo p1 = new PrototipoConcreto1();
        Prototipo p2 = new PrototipoConcreto2();
        Prototipo clon1, clon2;
        
        clon1 = p1.clonar();
        
        System.out.println("Clon del prototipo 1");
        System.out.println(p1.getNombre());
        System.out.println(clon1.getNombre());
        clon1.setNombre("Clon 1");
        
        System.out.println("CLon del prototipo 1 modificado");
        System.out.println(p1.getNombre());
        System.out.println(clon1.getNombre());
        
        clon2 = clon1.clonar();
        System.out.println("\nDatos del clon2");
        System.out.println(clon1.getNombre());
        System.out.println(clon2.getNombre());
        
    }
    
}
