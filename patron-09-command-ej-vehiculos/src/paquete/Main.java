package paquete;




public class Main {
	
	public static void main(String[] args) {
		
		Vehiculo vehiculo1 = new Vehiculo("Mercedes", 1, 1000);
		Vehiculo vehiculo2 = new Vehiculo("Audi", 6, 2000);
		Vehiculo vehiculo3 = new Vehiculo("Lexus", 2, 3000);
		
		Catalogo catalogo = new Catalogo();
		catalogo.agrega(vehiculo1);
		catalogo.agrega(vehiculo2);
		catalogo.agrega(vehiculo3);
		
		System.out.println("Visualizo el catálogo inicial:");
		catalogo.visualiza();
		System.out.println("");
		
		// Rebaja 1.
		SolicitudRebaja solicitudRebaja1 = new SolicitudRebaja(10, 5, 0.1);
		catalogo.ejecutaSolicitudRebaja(solicitudRebaja1);
		
		System.out.println("Visualizo el catálogo con la rebaja 1:");
		catalogo.visualiza();
		System.out.println("");
		
		// Rebaja 2.
		SolicitudRebaja solicitudRebaja2 = new SolicitudRebaja(10, 5, 0.5);
		catalogo.ejecutaSolicitudRebaja(solicitudRebaja2);
		
		System.out.println("Visualizo el catálogo con la rebaja 2:");
		catalogo.visualiza();
		System.out.println("");
		
		// Anulación de las rebajas.
		catalogo.anulaSolicitudRebaja(0);
		
		System.out.println("Visualizo el catálogo anulando la rebaja 2:");
		catalogo.visualiza();
		System.out.println("");
		
	}
	
}
