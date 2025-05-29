package patron.composite.ejercicio;

import java.util.List;
import java.util.ArrayList;




public class EmpresaMadre extends Empresa {
	
	protected List<Empresa> filiales = new ArrayList<Empresa>();
	
	
	
	
	@Override
	public double calculaCosteMantenimiento() {
		
		double coste = 0.0;
		
		for(Empresa filial : filiales) {
			coste = coste + filial.calculaCosteMantenimiento();
		}
		
		// coste = coste + n_vehiculos * costeUnitarioVehiculo;		// Añadido después para contemplar si una empresa madre pudiese tener coches propios, además de los de sus filiales.
		
		return coste;
		
	}
	
	@Override
	public boolean agregaFilial(Empresa filial) {
		
		return filiales.add(filial);
		
	}

}
