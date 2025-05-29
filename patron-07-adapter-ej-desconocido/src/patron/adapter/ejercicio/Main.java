package patron.adapter.ejercicio;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
    	
    	// Sin adaptador
    	/* Scanner scanner = new Scanner(System.in);
    	String forma;
    	Adaptado adaptado = new Adaptado("Original sin adaptar");
    	System.out.println("¿Cómo quieres mostrarlo?");
    	forma = scanner.nextLine();
    	adaptado.mostrarNombre(forma); */
    	
    	// Con adaptador
    	Scanner scanner = new Scanner(System.in);
    	int forma;
    	Adaptado adaptado = new Adaptado("Original adaptado");
    	InterfazObjetivo adaptador = new Adaptador(adaptado);
    	System.out.println("¿Cómo quieres mostrarlo?");
    	forma = scanner.nextInt();
    	adaptador.mostrarNombre(forma);
    	
    	
    	
        
    }
    
}
