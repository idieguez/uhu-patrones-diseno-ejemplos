package patron.adapter.ejercicio;




public class Adaptado {
	
	private String nombre;
	
	
	
	
	public Adaptado(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarNombre(String forma) {
		
		if (forma.equalsIgnoreCase("mayuscula"))
			System.out.println("EL NOMBRE ES: " + nombre.toUpperCase());
		else
			System.out.println("el nombre es: " + nombre.toLowerCase());
		
	}
	
}
