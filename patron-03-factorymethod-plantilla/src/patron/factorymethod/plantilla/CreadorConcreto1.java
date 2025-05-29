package patron.factorymethod.plantilla;




public class CreadorConcreto1 extends Creador{
    private String tipo = "Tipo 1";

    public CreadorConcreto1() {
    }
    
    @Override
    public Producto factory_Method(){
        System.out.println("Vamos a crear un objeto desde la fabrica 1");
        return new ProductoConrcreto1();
    }
}
