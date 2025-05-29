package paquete;




public interface Sujeto {
	
	public void registrarObservador(Observador observador);
	public void retirarObservador(Observador observador);
	public void ejecutaAccion(String accion, String lugar);
	public void notifica();
	
}
