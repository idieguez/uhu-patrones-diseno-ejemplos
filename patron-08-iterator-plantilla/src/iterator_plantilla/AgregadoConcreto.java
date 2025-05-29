package iterator_plantilla;

public class AgregadoConcreto implements I_Agregado {
    private int numeros[];
    private int pos;

    public AgregadoConcreto() {
        this.numeros = new int[7];
        this.pos = 0;
    }
    
    
    
    @Override
    public void agregar(int elemento) {
        numeros[pos++]=elemento;
    }

    @Override
    public I_Iterador CrearIterador() {
        return new IteradorConcreto(numeros);
    }

    @Override
    public I_Iterador CrearIterador2() {
        return new IteradorConcreto2(numeros);
    }
    
}
