package patron.composite.ejercicio;

import java.util.List;




public class DepartamentoInvestigacion extends ElementoEducativo {
	
	protected String nombre;
	
	public DepartamentoInvestigacion(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String getNombreElemento() {
		return nombre;
	}
	
	@Override
	public boolean agregaHoja(ElementoEducativo elementoEducativo) {
		return false;
	}
	
	@Override
	public List<ElementoEducativo> obtenerHojas() {
		return null;
	}
	
}
