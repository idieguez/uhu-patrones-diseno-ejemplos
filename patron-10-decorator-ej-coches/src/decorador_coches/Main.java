package decorador_coches;




public class Main {
	
	public static void main(String[] args) {
		
		ComponenteGraficoVehiculo coche_e = new CocheBase();
		System.out.println("Coche_e: " + coche_e.descripcion());
		System.out.println("Coste del coche: " + coche_e.getCoste());
		
		System.out.println("------------------------------------------");
		
		coche_e = new AireAcondicionado(coche_e);
		System.out.println("Coche_e: " + coche_e.descripcion());
		System.out.println("Coste del coche: " + coche_e.getCoste());
		
	}
	
}
