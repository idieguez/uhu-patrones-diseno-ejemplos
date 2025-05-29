package patron.composite.ejercicio;

import java.util.List;




public class DepartamentoInvestigacion extends ElementoEducativo {
	
	public DepartamentoInvestigacion(String nombre) {
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
