package patron.composite.plantilla;

import java.util.List;
import java.util.ArrayList;




public class Compuesto extends Componente {
	
	protected List<Componente> elementos = new ArrayList<Componente>();
	
	@Override
	public void solicita() {
		for(Componente elemento : elementos) {
			elemento.solicita();
		}
	}
	
	@Override
	public boolean agregaHoja(Componente hoja) {
		return elementos.add(hoja);
	}
	
	@Override
	public boolean suprimeHoja(Componente hoja) {
		return elementos.remove(hoja);
	}
	
}
