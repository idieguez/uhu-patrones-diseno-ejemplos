package paquete;

import java.util.ArrayList;
import java.util.List;




public class SolicitudRebaja {
	
	protected List<Vehiculo> vehiculosEnStock = new ArrayList<>();
	
	protected long hoy;
	protected long tiempoEnStock;
	protected double tasaDescuento;
	
	public SolicitudRebaja(long hoy, long tiempoEnStock, double tasaDescuento) {
		this.hoy = hoy;
		this.tiempoEnStock = tiempoEnStock;
		this.tasaDescuento = tasaDescuento;
	}
	
	public void rebaja(List<Vehiculo> vehiculos) {
		
		vehiculosEnStock.clear();
		
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo.getTiempoStock(hoy) >= tiempoEnStock) {
				vehiculosEnStock.add(vehiculo);
			}
		}
		
		for (Vehiculo vehiculo : vehiculosEnStock) {
			if (vehiculo.getTiempoStock(hoy) >= tiempoEnStock) {
				vehiculo.modificaPrecio(1.0 - tasaDescuento);
			}
		}
		
	}
	
	// anulo la rebaja a los vehículos a los que se la he hecho previamente.
	public void anula() {
		
		for (Vehiculo vehiculo : vehiculosEnStock) {
			vehiculo.modificaPrecio(1.0 / (1.0 - tasaDescuento));
		}
		
	}
	
	// restablezco la rebaba a los vehículos a los que se la había hecho previamente.
	public void restablece() {
		
		for (Vehiculo vehiculo : vehiculosEnStock) {
			vehiculo.modificaPrecio(1.0 - tasaDescuento);
		}
		
	}
	
}
