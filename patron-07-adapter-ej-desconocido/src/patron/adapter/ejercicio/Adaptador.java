package patron.adapter.ejercicio;




public class Adaptador implements InterfazObjetivo {
	
	private Adaptado adaptado;
	
	
	
	
	public Adaptador(Adaptado adaptado) {
		this.adaptado = adaptado;
	}
	
	@Override
	public void mostrarNombre(int forma) {
		
		if (forma == 1)
			adaptado.mostrarNombre("MAYUSCULA");
		else
			adaptado.mostrarNombre("minuscula");
		
	}
	
}
