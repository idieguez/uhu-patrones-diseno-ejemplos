package decorador_coches;




public abstract class DecoradorCoche implements ComponenteGraficoVehiculo{
	
	protected ComponenteGraficoVehiculo coche;
	
    public DecoradorCoche(ComponenteGraficoVehiculo coche) {
        this.coche = coche;
    }
    
    @Override
    public abstract String descripcion();
    
    @Override
    public abstract double getCoste();
    
}
