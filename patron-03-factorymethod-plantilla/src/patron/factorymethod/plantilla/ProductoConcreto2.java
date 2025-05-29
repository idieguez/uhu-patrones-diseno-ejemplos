package patron.factorymethod.plantilla;




public class ProductoConcreto2 extends Producto{
    String datos_Concreto2 = "Soy el concreto 2";

    public ProductoConcreto2() {
    }
    
    @Override
    public String tipo_Producto(){
        return datos_Concreto2;
    }
}
