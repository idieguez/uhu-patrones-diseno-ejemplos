package patron.composite.ejercicio;

import java.util.List;




public abstract class ElementoEducativo {
	
	protected int n_elementos;
	
	public void agregaElemento() {
		n_elementos++;
	}

	public abstract String getNombreElemento();
	public abstract boolean agregaHoja(ElementoEducativo elementoEducativo);
	public abstract List<ElementoEducativo> obtenerHojas();
	
}
