package patron.abstractfactory.plantilla;

public class ProductoB2 extends ProductoAbstractoB {
    
    public ProductoB2(String modelo, String estilo, int ano, double precio) {
        super(modelo, estilo, ano, precio);
    }
    
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Producto B2: Modelo '" + modelo + "', Estilo '" + estilo + "', Año '" + ano + "', Precio '" + precio + "'.");
    }
    
}
