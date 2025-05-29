package patron.prototypeyfactorymethod.ejfiguras;




public class Circulo implements Figura {
	
    private String nombre = "Circulo genérico";
    private int coordenadaX, coordenadaY;
    private int radio;
    
    
    
    
    @Override
    public void setNombre(String n) {
    	
        nombre = n;
        
    }
    
    
    @Override
    public String getNombre() {
    	
        return nombre;
        
    }
    
    
    @Override
    public void moverFigura(int x, int y, int tamaño) {
    	
        coordenadaX = x;
        coordenadaY = y;
        radio = tamaño;
        
    }
    
    
    @Override
    public String getPosicion() {
    	
        return "Soy un circulo en las coordenadas "+ coordenadaX + " y " + coordenadaY + " con un radio de "+radio+"\n";
        
    }
    
    
    @Override
    public Figura clonar() {
    	
        Figura figura = new Circulo();
        figura.setNombre(nombre);
        figura.moverFigura(coordenadaX, coordenadaY, radio);
        return figura;
        
    }
    
}
