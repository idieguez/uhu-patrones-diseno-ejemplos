package patron.prototypeyfactorymethod.ejfiguras;

import java.util.Scanner;




public class Prototype_factory_figuras {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int opcion, posX, posY, tamaño;
		String nombre;
		
		Figura figura = null;
		Figura clon;
		Creador miFabrica = new CreadorConcreto();
		
		
		do {
			
			System.out.println("¿Qué quiere crear?\n1. Circulo \n2. Clon circulo\n 3. Cuadradado\n4. Clon cuadrado\n5. Salir");
			opcion = sc.nextInt();
			while (opcion < 1 || opcion > 5) {
				System.out.println("Te has equivocado, intentalo de nuevo: ");
				opcion = sc.nextInt();
			}
			
			switch (opcion) {
				
				case 1:
				case 3:
					figura = miFabrica.FactoryMethod(opcion);
					System.out.print("Indique el nombre: ");
					nombre = sc1.nextLine();
					figura.setNombre(nombre);
					System.out.print("Indique coordenada X:");
					posX = sc.nextInt();
					System.out.print("Indique coordenada Y:");
					posY = sc.nextInt();
					System.out.print("Indique el tamaño:");
					tamaño = sc.nextInt();
					figura.moverFigura(posX, posY, tamaño);
					break;
					
				case 2:
				case 4:
					clon = miFabrica.FactoryMethod(opcion);
					break;
					
				default:
					figura = null;
					
			}
			
			if (figura != null) {
				System.out.println("Soy una figura y mi nombre es " + figura.getNombre() + " y mi posicion es " + figura.getPosicion());
			}
			
		} while (opcion != 5);
		
	}

}
