package patron.composite.ejercicio;




public abstract class Empresa {
	
	protected static double costeUnitarioVehiculo = 50.0;
	protected int n_vehiculos;
	
	
	
	
	public void agregaVehiculo() {
		
		n_vehiculos++;
		
	}
	
	public abstract double calculaCosteMantenimiento();
	public abstract boolean agregaFilial(Empresa filial);
	
}
