package patron.abstractfactory.plantilla;

public class ProductoB1 extends ProductoAbstractoB {
    
    public ProductoB1(String modelo, String estilo, int ano, double precio) {
        super(modelo, estilo, ano, precio);
    }
    
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Producto B1: Modelo '" + modelo + "', Estilo '" + estilo + "', Año '" + ano + "', Precio '" + precio + "'.");
    }
    
}
