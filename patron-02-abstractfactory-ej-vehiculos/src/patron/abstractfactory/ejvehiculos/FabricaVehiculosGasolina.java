package patron.abstractfactory.ejvehiculos;




public class FabricaVehiculosGasolina implements FabricaVehiculos {
    
    @Override
    public Automovil fabricarAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilGasolina(modelo, color, potencia, espacio);
    }
    
    @Override
    public Scooter fabricarScooter(String modelo, String color, int potencia) {
        return new ScooterGasolina(modelo, color, potencia);
    }
    
}
