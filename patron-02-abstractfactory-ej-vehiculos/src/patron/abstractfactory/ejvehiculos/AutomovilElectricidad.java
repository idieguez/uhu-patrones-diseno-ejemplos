package patron.abstractfactory.ejvehiculos;




public class AutomovilElectricidad extends Automovil {
    
    // En un ejemplo más fiel, debería haber diferencias entre un automóvil electricidad y uno de gasolina.
    // Esta diferencia se haría con atributos propios en las clases concretas.
    
    
    
    
    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }
    
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Automovil electricidad: " + modelo + " " + color + " " + potencia + " " + espacio);
    }
    
}
