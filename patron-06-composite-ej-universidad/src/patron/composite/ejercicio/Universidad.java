package patron.composite.ejercicio;

import java.util.List;
import java.util.ArrayList;




public class Universidad extends ElementoEducativo {

	protected String nombre;
	protected List<ElementoEducativo> elementosEducativos = new ArrayList<ElementoEducativo>();
	
	public Universidad(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String getNombreElemento() {
		return nombre;
	}
	
	@Override
	public boolean agregaHoja(ElementoEducativo elementoEducativo) {
		return elementosEducativos.add(elementoEducativo);
	}
	
	public List<ElementoEducativo> obtenerHojas() {
		return elementosEducativos;
	}
	
}
