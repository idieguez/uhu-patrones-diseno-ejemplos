package patron.abstractfactory.ejvehiculos;

import java.util.Scanner;




public class PatronAbstractFactoryEjVehiculos {
    
    public static int numAutomovil = 3;
    public static int numScooter = 2;
    
    
    
    
    public static void main(String[] args) {
        
        // Creación de los objetos para los vehículos: automóviles y scooters.
        FabricaVehiculos fabricaVehiculos = null;
        
        String modelo;
        String color;
        int potencia;
        double espacio;
        
        Automovil[] automoviles = new Automovil[numAutomovil];
        Scooter[] scooters = new Scooter[numScooter];
        
        
        // Creación de los objetos para interactuar con el usuario.
        Scanner reader = new Scanner(System.in);
        int eleccion;
        
        
        // Interacción con el usuario.
        System.out.println("FÁBRICA DE VEHÍCULOS");
        System.out.println("--------------------------------------------------");
        System.out.println("");
        System.out.println("¿Qué tipo de vehículo quiere crear?");
        System.out.println("    1. Gasolina");
        System.out.println("    2. Electricidad");
        System.out.println("");
        System.out.print  ("Introduzca su elección: ");
        
        eleccion = reader.nextInt();
        modelo = reader.nextLine();
        
        
        // Creación de la fábrica: gasolina o electricidad.
        switch(eleccion) {
            
            case 1:
                fabricaVehiculos = new FabricaVehiculosGasolina();
                break;
                
            case 2:
                fabricaVehiculos = new FabricaVehiculosElectricidad();
                break;
                
            default:
                System.out.println("");
                System.out.println("Opción inválida.");
                return;
            
        }
        
        
        // Fabricación de los vehículos: automóviles.
        for (int i = 0; i < numAutomovil; i++) {
            System.out.println("");
            
            System.out.println("Fabricación del automovil " + (i + 1));
            System.out.print  ("Introduzca el modelo: ");
            modelo = reader.nextLine();
            System.out.print  ("Introduzca el color: ");
            color = reader.nextLine();
            System.out.print  ("Introduzca la potencia: ");
            potencia = reader.nextInt();
            System.out.print  ("Introduzca el espacio: ");
            espacio = reader.nextDouble();
            reader.nextLine();                                                  // Consumir el salto de línea pendiente (no lo hace el nextInt ni el nextDouble).
            
            automoviles[i] = fabricaVehiculos.fabricarAutomovil(modelo, color, potencia, espacio);
        }
        
        
        // Fabricación de las vehículos: scooters.
        for (int i = 0; i < numScooter; i++) {
            System.out.println("");
            
            System.out.println("Fabricación del scooter " + (i + 1));
            System.out.print  ("Introduzca el modelo: ");
            modelo = reader.nextLine();
            System.out.print  ("Introduzca el color: ");
            color = reader.nextLine();
            System.out.print  ("Introduzca la potencia: ");
            potencia = reader.nextInt();
            reader.nextLine();                                                  // Consumir el salto de línea pendiente (no lo hace el nextInt ni el nextDouble).
            
            scooters[i] = fabricaVehiculos.fabricarScooter(modelo, color, potencia);
        }
        
        
        // Mostrar los vehículos: automóviles y scooters.
        System.out.println("");
        System.out.println("Mostrar los vehículos fabricados.");
        System.out.println("");
        
        for (Automovil automovil: automoviles) {
            automovil.mostrarCaracteristicas();
        }
        
        System.out.println("");
        
        for (Scooter scooter: scooters) {
            scooter.mostrarCaracteristicas();
        }
        
        
        // Fin.
        System.out.println("");
        System.out.println("Fin de la aplicación.");
        
        reader.close();
        
    }
    
}
