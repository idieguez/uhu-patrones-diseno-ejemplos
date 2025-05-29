package patron.adapter.plantilla;




public class Adaptador implements InterfazObjetivo {
	
	private Adaptado adaptado;
	
	
	
	
	public Adaptador(Adaptado adaptado) {
		this.adaptado = adaptado;
	}
	
	@Override
	public void solicita() {
		
		// Hago los cambios necesarios...
		adaptado.solicitudEspecifica(true);
		
	}
	
}
