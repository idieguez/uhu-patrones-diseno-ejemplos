package patron.prototypeyfactorymethod.ejfiguras;




public interface Figura {
	
    public void setNombre(String n);
    public String getNombre();
    public void moverFigura(int x, int y, int tamaño);
    public String getPosicion();
    public Figura clonar();
    
}
