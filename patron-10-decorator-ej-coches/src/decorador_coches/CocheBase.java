package decorador_coches;




public class CocheBase implements ComponenteGraficoVehiculo{
    
    @Override
    public String descripcion() {
        return "Coche basico";
    }
    
    @Override
    public double getCoste() {
        return 15000;
    }
    
}
