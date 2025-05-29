package patron.factorymethod.plantilla;




public abstract class Producto {
    String datos_genericos="Soy el generico";
    
    public String tipo_Producto(){
        return datos_genericos;
    }
}
