package paquete;




public class ObservadorConcreto implements Observador {
	
	@Override
	public void actualizar(String accion, String lugar) {
		System.out.println("Soy un observador. Oído: acción " + accion + " en lugar " + lugar + ".");
	}
	
}
