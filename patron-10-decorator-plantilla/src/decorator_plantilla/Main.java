package decorator_plantilla;

public class Main {

    public static void main(String[] args) {

        ComponenteAbstracto comp1 = new ComponenteConcreto();

        System.out.println(comp1.getDescripcion());
        System.out.println("El precio es " + comp1.getPrecio());

        //-------------------------------------------------------
        System.out.println("-------------------------------------------------");
        Decorador decorador1 = new DecoradorConcretoA(comp1);
        System.out.println(decorador1.getDescripcion());
        System.out.println("El precio es " + decorador1.getPrecio());
        
        //-------------------------------------------------------
        System.out.println("-------------------------------------------------");
        Decorador decorador2 = new DecoradorConcretoB(decorador1);
        System.out.println(decorador2.getDescripcion());
        System.out.println("El precio es " + decorador2.getPrecio());
    }

}
