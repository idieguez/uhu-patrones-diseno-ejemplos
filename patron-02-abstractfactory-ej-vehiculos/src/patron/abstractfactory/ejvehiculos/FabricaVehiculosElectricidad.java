package patron.abstractfactory.ejvehiculos;




public class FabricaVehiculosElectricidad implements FabricaVehiculos {
    
    @Override
    public Automovil fabricarAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilElectricidad(modelo, color, potencia, espacio);
    }
    
    @Override
    public Scooter fabricarScooter(String modelo, String color, int potencia) {
        return new ScooterElectricidad(modelo, color, potencia);
    }
    
}
