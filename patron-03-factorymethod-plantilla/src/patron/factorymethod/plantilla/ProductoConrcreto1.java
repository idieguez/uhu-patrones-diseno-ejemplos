package patron.factorymethod.plantilla;




public class ProductoConrcreto1 extends Producto {
	
	String datos_Concreto1 = "Soy el concreto 1";
	
	public ProductoConrcreto1() {
	}
	
	@Override
	public String tipo_Producto() {
		return datos_Concreto1;
	}
	
}
