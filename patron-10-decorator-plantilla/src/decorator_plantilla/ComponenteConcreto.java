package decorator_plantilla;

public class ComponenteConcreto implements ComponenteAbstracto {
    private String descricpionComponente="Caracteristicas componennte inicial";
    private float precio = 100;
    
    @Override
    public String getDescripcion() {
        return descricpionComponente;
    }

    @Override
    public float getPrecio() {
        return precio;
    }
    
}
