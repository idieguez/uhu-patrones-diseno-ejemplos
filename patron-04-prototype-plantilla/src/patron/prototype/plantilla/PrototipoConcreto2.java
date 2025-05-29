package patron.prototype.plantilla;




public class PrototipoConcreto2 implements Prototipo{
	
    String nombre = "Prototipo 2";
    
    
    
    
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
        Prototipo prototipo = new PrototipoConcreto2();
        prototipo.setNombre(nombre);
        return prototipo;
    }
    
}
