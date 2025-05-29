package patron.composite.plantilla;




public class Hoja extends Componente {
	
	@Override
	public void solicita() {
		System.out.println("Solicita operación de hoja.");
	}
	
	@Override
	public boolean agregaHoja(Componente hoja) {
		return false;
	}
	
	@Override
	public boolean suprimeHoja(Componente hoja) {
		return false;
	}
	
}
