package patron.abstractfactory.ejvehiculos;




public class AutomovilGasolina extends Automovil {
    
    // En un ejemplo más fiel, debería haber diferencias entre un automóvil electricidad y uno de gasolina.
    // Esta diferencia se haría con atributos propios en las clases concretas.
    
    
    
    
    public AutomovilGasolina(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }
    
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Automovil gasolina: " + modelo + " " + color + " " + potencia + " " + espacio);
    }
    
}
