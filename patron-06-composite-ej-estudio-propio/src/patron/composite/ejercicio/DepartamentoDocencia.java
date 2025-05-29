package patron.composite.ejercicio;

import java.util.List;




public class DepartamentoDocencia extends ElementoEducativo {
	
	public DepartamentoDocencia(String nombre) {
		super(nombre);
	}
	
	public boolean addElementoEducativoHijo(ElementoEducativo elementoEducativoHijo) {
		return false;
	}
	
	public boolean removeElementoEducativoHijo(ElementoEducativo elementoEducativoHijo) {
		return false;
	}
	
	public List<ElementoEducativo> getElementosEducativosHijos() {
		return null;
	}
	
}
