package iterator_plantilla;

import iterator_plantilla.I_Iterador;

public class ListaPalabrasIterador implements I_Iterador {

    private String palabras[];
    private int posicion;

    public ListaPalabrasIterador(String[] palabras) {
        this.palabras = palabras;
        posicion = 0;
    }

    @Override
    public Object siguiente() {
        if (posicion < palabras.length) {
            return palabras[posicion++];
        } else {
            System.out.println("Ya no quedan elementos");
            return null;
        }
    }

    @Override
    public Object anterior() {
        if (posicion >= 0) {
            return palabras[--posicion];
        } else {
            System.out.println("Ya no quedan elementos");
            return null;
        }
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < palabras.length;
    }

}
