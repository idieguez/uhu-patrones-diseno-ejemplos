package paquete;

import java.util.Scanner;




public class Main {
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	Sujeto sujeto = new SujetoConcreto();
    	Observador observador1 = new ObservadorConcreto();
    	Observador observador2 = new ObservadorConcreto();
    	
    	// Registrar los observadores.
    	sujeto.registrarObservador(observador1);
    	sujeto.registrarObservador(observador2);
    	
    	// Preguntar.
    	System.out.println("Indicamos la acción: ");
    	String accion = scanner.nextLine();
    	System.out.println("Indicamos el lugar: ");
    	String lugar = scanner.nextLine();
    	
    	// Mostrar.
    	sujeto.ejecutaAccion(accion, lugar);
    	
    }
    
}
