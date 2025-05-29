package patron.factorymethod.plantilla;




public class CreadorConcreto2 extends Creador {
	
    private String tipo = "Tipo 2";

    public CreadorConcreto2() {
    }
    
    @Override
    public Producto factory_Method(){
        System.out.println("Vamos a crear un objeto desde la fabrica 2");
        return new ProductoConcreto2();
    }
    
}
