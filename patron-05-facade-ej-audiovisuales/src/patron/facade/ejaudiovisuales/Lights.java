package patron.facade.ejaudiovisuales;




public class Lights implements I_Lights {
    
    @Override
    public void on() {
        System.out.println("Luces encendidas.");
    }
    
    @Override
    public void off() {
        System.out.println("Luces apagadas.");
    }
    
}
