package paquete;




public class Solicitante {
	
	private SolicitudInterfaz solicitud;
	
	public Solicitante(SolicitudInterfaz solicitud) {
		this.solicitud = solicitud;
	}
	
	public void ejecutaComando() {
		this.solicitud.ejecuta();
	}
	
}
