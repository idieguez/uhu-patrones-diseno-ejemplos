package patron.composite.ejercicio;




public class EmpresaSinFilial extends Empresa {
	
	@Override
	public double calculaCosteMantenimiento() {
		
		return n_vehiculos * costeUnitarioVehiculo;
		
	}
	
	@Override
	public boolean agregaFilial(Empresa filial) {
		
		return false;
		
	}
	
}
