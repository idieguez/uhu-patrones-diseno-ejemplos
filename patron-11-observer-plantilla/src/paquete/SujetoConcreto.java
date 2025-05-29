package paquete;

import java.util.ArrayList;
import java.util.List;




public class SujetoConcreto implements Sujeto {
	
	private List<Observador> observadores;
	private String accion;
	private String lugar;
	
	public SujetoConcreto() {
		observadores = new ArrayList<>();
	}
	
	@Override
	public void registrarObservador(Observador observador) {
		observadores.add(observador);
	}
	
	@Override
	public void retirarObservador(Observador observador) {
		observadores.remove(observador);
	}
	
	@Override
	public void ejecutaAccion(String accion, String lugar) {
		this.accion = accion;
		this.lugar = lugar;
		notifica();
	}
	
	@Override
	public void notifica() {
		
		for (Observador observador : observadores) {
			observador.actualizar(accion, lugar);
		}
		
	}
	
}
