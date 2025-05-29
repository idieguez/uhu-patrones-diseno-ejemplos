package paquete;




public abstract class SolicitudAbstracta implements SolicitudInterfaz {

	@Override
	public void ejecuta() {
		preExecute();
		doExecute();
		postExecute();
	}
	
	protected abstract void preExecute();
	
	protected abstract void doExecute();
	
	protected abstract void postExecute();
	
}
