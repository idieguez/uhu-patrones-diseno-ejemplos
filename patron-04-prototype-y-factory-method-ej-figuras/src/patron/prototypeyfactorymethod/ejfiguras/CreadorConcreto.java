package patron.prototypeyfactorymethod.ejfiguras;




public class CreadorConcreto extends Creador{
	
    private int tipo;
    private Figura f;
    private boolean circulo;
    private boolean cuadrado;
    
    
    
    
    public CreadorConcreto() {
    	
        circulo = false;
        cuadrado = false;
        f = null;
        
    }
    
    
    @Override
    public Figura FactoryMethod(int t) {
    	
        tipo = t;
        
        if (tipo == 1) {
        	
            f = new Circulo();
            circulo = true;
            return f;
            
        } else if (tipo == 2 && circulo) {
        	
        	return f.clonar();
        	
        } else if (tipo == 3) {
        	
            f = new Cuadrado();
            cuadrado = true;
            return f;
            
        } else if (tipo == 4 && cuadrado) {
        	
            return f.clonar();
            
        } else {
        	
            System.out.println("No puedes crear un clon sin original");
            return null;
            
        }
        
    }
    
}
