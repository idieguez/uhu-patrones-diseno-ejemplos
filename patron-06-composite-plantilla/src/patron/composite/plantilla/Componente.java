package patron.composite.plantilla;




public abstract class Componente {
	
	protected int n_elementos;
	
	public abstract void solicita();
	public abstract boolean agregaHoja(Componente hoja);
	public abstract boolean suprimeHoja(Componente hoja);
	
}
