package patron.abstractfactory.plantilla;

public class ProductoA1 extends ProductoAbstractoA {
    
    public ProductoA1(String modelo, String estilo, int ano) {
        super(modelo, estilo, ano);
    }
    
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Producto A1: Modelo '" + modelo + "', Estilo '" + estilo + "', Año '" + ano + "'.");
    }
    
}
