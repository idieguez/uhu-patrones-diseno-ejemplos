package paquete;




public class Vehiculo {
	
	protected String nombre;
	protected long fechaEntradaStock;										// para simplificar ponemos un long, pero debería ser un date o similar.
	protected double precioVenta;
	
	public Vehiculo (String nombre, long fecha, double precioVenta) {
		this.nombre = nombre;
		this.fechaEntradaStock = fecha;
		this.precioVenta = precioVenta;
	}
	
	public long getTiempoStock(long hoy) {
		return hoy - fechaEntradaStock;
	}
	
	public void modificaPrecio(double coeficiente) {
		this.precioVenta = 0.01 * Math.round(coeficiente * this.precioVenta*100);
	}
	
	public void visualiza() {
		System.out.println(nombre + " precio: " + precioVenta + " fecha entrada en stock " + fechaEntradaStock);
	}
	
}
