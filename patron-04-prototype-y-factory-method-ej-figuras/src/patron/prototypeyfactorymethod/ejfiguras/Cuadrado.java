package patron.prototypeyfactorymethod.ejfiguras;




public class Cuadrado implements Figura {
	
	private String nombre = "Cuadrado genérico";
    private int coordenadaX, coordenadaY;
    private int lado;
    
    
    
    
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
        lado = tamaño;
        
    }
    
    
    @Override
    public String getPosicion() {
    	
        return "Soy un cuadrado en las coordenadas " + coordenadaX + " y " + coordenadaY + " con un lado de " + lado + "\n";
        
    }
    
    
    @Override
    public Figura clonar() {
    	
        Figura figura = new Cuadrado();
        figura.setNombre(nombre);
        figura.moverFigura(coordenadaX, coordenadaY, lado);
        return figura;
        
    }
    
}
