package patron.factorymethod.plantilla;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        String tipo;
        Producto p;
        
        Creador miFabricaObjetos;
        
        System.out.println("¿Que producto desea?");
        tipo = sc.nextLine();
        
        //Versión sin aplicar el patrón
        /*if(tipo.equalsIgnoreCase("Tipo 1"))
            p = new ProductoConrcreto1();
        else
            p = new ProductoConcreto2();*/
        
        //****Segunda version (Aplicando el patron)*****//
        /*miFabricaObjetos=new CreadorConcreto(tipo);
        p=miFabricaObjetos.factory_Method();*/
        
        //****Ultima version*****//
        if(tipo.equalsIgnoreCase("Tipo 1")){
            miFabricaObjetos = new CreadorConcreto1();
            p=miFabricaObjetos.factory_Method();
        }else
            miFabricaObjetos = new CreadorConcreto2();
            p=miFabricaObjetos.factory_Method();
        
        System.out.println(p.tipo_Producto());
        
    }
    
}
