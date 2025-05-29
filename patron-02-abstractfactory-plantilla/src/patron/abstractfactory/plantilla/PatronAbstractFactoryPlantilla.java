package patron.abstractfactory.plantilla;

import java.util.Scanner;

public class PatronAbstractFactoryPlantilla {
    
    public static void main(String[] args) {
        
        // Ejercicio basado en el que se ha visto en la diapositiva de explicación del patrón en clase.
        
        int numProductosB = 3;
        int numProductosA = 2;
        
        Scanner reader1 = new Scanner(System.in);
        Scanner reader2 = new Scanner(System.in);
        
        FabricaAbstracta fabrica;
        int eleccion;
        String modelo, estilo;
        int ano;
        double precio;
        
        ProductoAbstractoB[] productosB = new ProductoAbstractoB[numProductosB];
        ProductoAbstractoA[] productosA = new ProductoAbstractoA[numProductosA];
        
        System.out.println("Elija si desea productos del tipo 1 o 2: ");
        eleccion = reader1.nextInt();
        
        if (eleccion == 1) {
            fabrica = new FabricaConcreta1();
        } else {
            fabrica = new FabricaConcreta2();
        }
        
        for (int i = 0; i < numProductosB; i++) {
            System.out.println("Producto B" + i);
            
            System.out.println("Introduzca el modelo: ");
            modelo = reader2.nextLine();
            
            System.out.println("Introduzca el estilo: ");
            estilo = reader2.nextLine();
            
            System.out.println("Introduzca el año: ");
            ano = reader1.nextInt();
            
            System.out.println("Introduzca el precio: ");
            precio = reader1.nextDouble();
            
            productosB[i] = fabrica.creaProductoB(modelo, estilo, ano, precio);
        }
        
        for (int i = 0; i < numProductosA; i++) {
            System.out.println("Producto A" + i);
            
            System.out.println("Introduzca el modelo: ");
            modelo = reader2.nextLine();
            
            System.out.println("Introduzca el estilo: ");
            estilo = reader2.nextLine();
            
            System.out.println("Introduzca el año: ");
            ano = reader1.nextInt();
            
            productosA[i] = fabrica.creaProductoA(modelo, estilo, ano);
        }
        
        System.out.println("Mostrar características.");
        
        for (ProductoAbstractoB productoB: productosB) {
            productoB.mostrarCaracteristicas();
        }
        
        for (ProductoAbstractoA productoA: productosA) {
            productoA.mostrarCaracteristicas();
        }
        
    }
    
}
