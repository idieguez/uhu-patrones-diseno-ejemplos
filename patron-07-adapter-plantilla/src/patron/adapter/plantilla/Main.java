package patron.adapter.plantilla;




public class Main {

    public static void main(String[] args) {
        
        // Sin adaptador.
    	Adaptado adaptado = new Adaptado();
    	System.out.println("Hago la llamada sin adaptar");
    	adaptado.solicitudEspecifica(false);
    	
    	// Con adaptador.
    	InterfazObjetivo adaptador = new Adaptador(adaptado);
    	System.out.println("Hago la llamada adaptada");
    	adaptador.solicita();
        
    }
    
}
