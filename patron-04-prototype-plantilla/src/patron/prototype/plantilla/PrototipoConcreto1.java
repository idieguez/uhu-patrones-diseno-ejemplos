package patron.prototype.plantilla;




public class PrototipoConcreto1 implements Prototipo {
	
    private String nombre;
    
    
    
    
    public PrototipoConcreto1() {
    	
        nombre="Prototipo 1";
        
    }
    
    
    @Override
    public String getNombre() {
    	
        return nombre;
        
    }
    
    
    @Override
    public void setNombre(String n) {
    	
        nombre = n;
        
    }
    
    
    @Override
    public Prototipo clonar() {
    	
        Prototipo prototipo = new PrototipoConcreto1();
        prototipo.setNombre(nombre);
        return prototipo;
        
    }
    
}
