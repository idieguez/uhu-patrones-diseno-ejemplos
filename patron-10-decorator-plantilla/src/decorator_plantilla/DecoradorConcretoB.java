package decorator_plantilla;

public class DecoradorConcretoB extends Decorador{
    private ComponenteAbstracto c2;
    private String caracteristica_d = "Decoracion 2";

    public DecoradorConcretoB(ComponenteAbstracto c2) {
        this.c2 = c2;
    }
    
    @Override
    public String getDescripcion() {
        return c2.getDescripcion()+caracteristica_d;
    }

    @Override
    public float getPrecio() {
        return c2.getPrecio()+75;
    }
    
}
