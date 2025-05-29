package patron.composite.plantilla;




public class Main {

    public static void main(String[] args) {
        
        Componente componente1 = new Hoja();
        System.out.println("Solicitar operación de hoja:");
        componente1.solicita();
        System.out.println("");
        
        Componente componente2 = new Hoja();
        System.out.println("Solicitar operación de hoja:");
        componente2.solicita();
        System.out.println("");
        
        Componente grupo1 = new Compuesto();
        grupo1.agregaHoja(componente1);
        grupo1.agregaHoja(componente2);
        System.out.println("Solicitar operación de grupo:");
        grupo1.solicita();
        System.out.println("");
        
        Componente grupo2 = new Compuesto();
        grupo2.agregaHoja(componente1);
        grupo2.agregaHoja(componente2);
        grupo2.agregaHoja(grupo1);
        System.out.println("Solicitar operación de grupo:");
        grupo2.solicita();
        System.out.println("");
        
    }
    
}
