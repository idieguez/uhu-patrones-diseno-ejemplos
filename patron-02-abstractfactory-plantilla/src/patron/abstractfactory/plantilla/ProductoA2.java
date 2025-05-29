package patron.abstractfactory.plantilla;

public class ProductoA2 extends ProductoAbstractoA {
    
    public ProductoA2(String modelo, String estilo, int ano) {
        super(modelo, estilo, ano);
    }
    
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Producto A2: Modelo '" + modelo + "', Estilo '" + estilo + "', Año '" + ano + "'.");
    }
    
}
