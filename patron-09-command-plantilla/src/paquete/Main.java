package paquete;




public class Main {
	
	public static void main(String[] args) {
		
		SolicitudInterfaz solicitud = new SolicitudConcreta();
		Solicitante solicitante = new Solicitante(solicitud);
		solicitante.ejecutaComando();
		
	}
	
}
