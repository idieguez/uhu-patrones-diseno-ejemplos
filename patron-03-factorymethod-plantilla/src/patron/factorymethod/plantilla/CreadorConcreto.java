package patron.factorymethod.plantilla;




public class CreadorConcreto extends Creador{
    private String tipo;

    public CreadorConcreto(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public Producto factory_Method(){
        System.out.println("Vamos a crear un objeto desde la fabrica");
        if(tipo.equalsIgnoreCase("Tipo 1"))
            return new ProductoConrcreto1();
        else
            return new ProductoConcreto2();
        
        
    }
}
