package iterator_plantilla;

public class Iterator_Plantilla {

    public static void main(String[] args) {
        I_Agregado ln = new AgregadoConcreto();
        I_Iterador iterador = ln.CrearIterador();
        I_Iterador iterador2 = ln.CrearIterador2();
        System.out.println("Voy a agregar numeros");
        ln.agregar(5);
        ln.agregar(1);
        ln.agregar(4);
        ln.agregar(67);
        ln.agregar(2);
        ln.agregar(24);
        ln.agregar(58);

        System.out.println("Voy a sacar los numeros como una cola ");
        while (iterador.tieneSiguiente()) {
            System.out.println(iterador.siguiente());
        }

        System.out.println("Voy a sacar los numeros cono una pila");
        while (iterador.tieneSiguiente()) {
            System.out.println(iterador2.siguiente());
        }

        IListaPalabras lp = new ListaPalabras();
        I_Iterador iteradorString = lp.CrearIterador();
        lp.agregar("Hola");
        lp.agregar("Adios");
        lp.agregar("Si");
        lp.agregar("No");
        lp.agregar("ETSI");
        lp.agregar("UHU");
        lp.agregar("Informatica");

        System.out.println("Voy a sacar las palabras como una cola");
        while (iteradorString.tieneSiguiente()) {
            System.out.println(iteradorString.siguiente());
        }
    }

}
