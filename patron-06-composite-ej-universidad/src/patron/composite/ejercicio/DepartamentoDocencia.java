package patron.composite.ejercicio;

import java.util.List;




public class DepartamentoDocencia extends ElementoEducativo {
	
	protected String nombre;
	
	public DepartamentoDocencia(String nombre) {
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
