package patron.composite.ejercicio;

import java.util.ArrayList;
import java.util.List;




public abstract class ElementoEducativo {
	
	protected String nombre;
	protected List<ElementoEducativo> elementosEducativosHijos = new ArrayList<ElementoEducativo>();
	
	
	
	
	public ElementoEducativo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean addElementoEducativoHijo(ElementoEducativo elementoEducativoHijo) {
		return elementosEducativosHijos.add(elementoEducativoHijo);
	}
	
	public boolean removeElementoEducativoHijo(ElementoEducativo elementoEducativoHijo) {
		return elementosEducativosHijos.remove(elementoEducativoHijo);
	}
	
	public List<ElementoEducativo> getElementosEducativosHijos() {
		return elementosEducativosHijos;
	}
	
}
