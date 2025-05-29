package decorator_plantilla;

public class DecoradorConcretoA extends Decorador{
    private ComponenteAbstracto c1;
    private String caracteristica_d = "Decoracion 1";

    public DecoradorConcretoA(ComponenteAbstracto c1) {
        this.c1 = c1;
    }
    
    @Override
    public String getDescripcion() {
     return c1.getDescripcion()+caracteristica_d;
    }

    @Override
    public float getPrecio() {
        return c1.getPrecio()+50; //Un aumento que podria ser un atributo
    }
    
}
