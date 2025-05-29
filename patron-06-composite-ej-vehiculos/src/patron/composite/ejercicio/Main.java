package patron.composite.ejercicio;




public class Main {
	
    public static void main(String[] args) {
        
        Empresa empresa1 = new EmpresaSinFilial();
        empresa1.agregaVehiculo();
        
        Empresa empresa2 = new EmpresaSinFilial();
        empresa2.agregaVehiculo();
        empresa2.agregaVehiculo();
        
        Empresa empresaMadre = new EmpresaMadre();
        // empresaMadre.agregaVehiculo();					// Añadido después para contemplar si una empresa madre pudiese tener coches propios, además de los de sus filiales.
        empresaMadre.agregaFilial(empresa1);
        empresaMadre.agregaFilial(empresa2);
        
        System.out.println("El coste del mantenimiento: " + empresaMadre.calculaCosteMantenimiento());
        
    }
    
}
