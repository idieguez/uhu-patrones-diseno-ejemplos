package iterator_plantilla;

public class IteradorConcreto2 implements I_Iterador {

    private int numeros[];
    private int posicion;

    public IteradorConcreto2(int[] numeros) {
        this.numeros = numeros;
        this.posicion = numeros.length - 1;
    }

    @Override
    public Object siguiente() {
        if (posicion >= 0) {
            return numeros[posicion--];
        } else {
            System.out.println("No tiene siguiente");
            return null;
        }
    }

    @Override
    public Object anterior() {
        if (posicion < numeros.length) {
            return numeros[++posicion];
        } else {
            System.out.println("No tiene anterior");
            return null;
        }
    }

    @Override
    public boolean tieneSiguiente() {
        if (posicion >= 0) {
            return true;
        } else {
            return false;
        }
    }

}
