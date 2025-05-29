package paquete;




public class SolicitudConcreta extends SolicitudAbstracta {
	
	@Override
	protected void preExecute() {
		System.out.println("Realizando operaciones previas...");
	}
	
	@Override
	protected void doExecute() {
		System.out.println("Ejecutando el comando concreto...");
	}
	
	@Override
	protected void postExecute() {
		System.out.println("Realizando operaciones posteriores...");
	}
	
	protected void almacenaAnulacion() {}
	
}
