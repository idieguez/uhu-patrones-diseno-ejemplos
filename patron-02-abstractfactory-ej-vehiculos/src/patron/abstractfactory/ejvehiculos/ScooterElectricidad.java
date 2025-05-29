package patron.abstractfactory.ejvehiculos;




public class ScooterElectricidad extends Scooter {
    
    // En un ejemplo más fiel, debería haber diferencias entre un automóvil electricidad y uno de gasolina.
    // Esta diferencia se haría con atributos propios en las clases concretas.
    
    
    
    
    public ScooterElectricidad(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }
    
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Scooter electricidad: " + modelo + " " + color + " " + potencia);
    }
    
}
