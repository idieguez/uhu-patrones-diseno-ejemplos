package iterator_plantilla;

public class IteradorConcreto implements I_Iterador {

    private int numeros[];
    private int posicion;

    public IteradorConcreto(int[] numeros) {
        this.numeros = numeros;
        this.posicion = 0;
    }

    @Override
    public Object siguiente() {
        if (posicion < numeros.length) {
            return numeros[posicion++];
        } else {
            System.out.println("Ya no quedan elementos");
            return null;
        }
    }

    @Override
    public Object anterior() {
        if (posicion > 0) {
            return numeros[--posicion];
        } else {
            System.out.println("No tiene anterior");
            return null;
        }
    }

    @Override
    public boolean tieneSiguiente() {
        if(posicion < numeros.length){
            return true;
        }else 
            return false;
    }

}
