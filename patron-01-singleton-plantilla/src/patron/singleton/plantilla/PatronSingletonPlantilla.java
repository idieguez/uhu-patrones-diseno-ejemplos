package patron.singleton.plantilla;




public class PatronSingletonPlantilla {

    public static void main(String[] args) {
        
        MiPatron mp1 = MiPatron.getMiPatron();
        MiPatron mp2 = MiPatron.getMiPatron();
        MiPatron mp3 = MiPatron.getMiPatron();
        MiPatron mp4 = MiPatron.getMiPatron();
        MiPatron mp5 = MiPatron.getMiPatron();
        
        mp1.mostrarVecesLlamado();
        mp3.mostrarVecesLlamado();
        mp5.mostrarVecesLlamado();
        
    }
    
}
