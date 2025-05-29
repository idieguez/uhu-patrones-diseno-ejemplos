package decorador_coches;




public class NavegadorGPS extends DecoradorCoche {
	
    public NavegadorGPS(ComponenteGraficoVehiculo coche) {
        super(coche);
    }
    
    @Override
    public String descripcion() {
        return coche.descripcion() + " Navegador GPS";
    }
    
    @Override
    public double getCoste() {
        return coche.getCoste() + 800;
    }
    
}
