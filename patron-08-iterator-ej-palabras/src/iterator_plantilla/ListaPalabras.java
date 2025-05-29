package iterator_plantilla;

public class ListaPalabras implements IListaPalabras {
    private String palabras[];
    private int posicion;

    public ListaPalabras() {
        this.palabras = new String[7];
        posicion = 0;
    }

    @Override
    public void agregar(String palabra) {
        palabras[posicion++]=palabra;
    }

    @Override
    public I_Iterador CrearIterador() {
        return new ListaPalabrasIterador(palabras);
    }
    
}
