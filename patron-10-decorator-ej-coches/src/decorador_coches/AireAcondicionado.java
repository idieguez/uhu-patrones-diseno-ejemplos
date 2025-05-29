package decorador_coches;




public class AireAcondicionado extends DecoradorCoche {
	
    public AireAcondicionado(ComponenteGraficoVehiculo coche) {
        super(coche);
    }
    
    @Override
    public String descripcion() {
        return coche.descripcion() + " Aire Acondicionado";
    }
    
    @Override
    public double getCoste() {
        return coche.getCoste() + 1200;
    }
    
}
