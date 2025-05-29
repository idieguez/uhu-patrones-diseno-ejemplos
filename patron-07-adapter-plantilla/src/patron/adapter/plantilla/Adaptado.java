package patron.adapter.plantilla;




public class Adaptado {
	
	public void solicitudEspecifica(boolean adaptacion) {
		
		if (adaptacion) System.out.println("Llamada a la solicitud específica y adaptado");
		else System.out.println("Solicitud sin adaptar no funciona en este entorno error");
		
	}
	
}
