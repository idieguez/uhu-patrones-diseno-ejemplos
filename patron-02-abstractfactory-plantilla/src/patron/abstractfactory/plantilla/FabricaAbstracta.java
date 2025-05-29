package patron.abstractfactory.plantilla;

public interface FabricaAbstracta {
    
    // Es una interfaz. Estudiar qué significa.
    
    ProductoAbstractoB creaProductoB(String modelo, String estilo, int ano, double precio);
    ProductoAbstractoA creaProductoA(String modelo, String estilo, int ano);
    
}
