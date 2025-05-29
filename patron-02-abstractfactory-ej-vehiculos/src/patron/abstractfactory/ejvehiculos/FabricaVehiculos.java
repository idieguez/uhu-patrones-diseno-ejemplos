package patron.abstractfactory.ejvehiculos;




public interface FabricaVehiculos {
    
    Automovil fabricarAutomovil(String modelo, String color, int potencia, double espacio);
    Scooter fabricarScooter(String modelo, String color, int potencia);
    
}
