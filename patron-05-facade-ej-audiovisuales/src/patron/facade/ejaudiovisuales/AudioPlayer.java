package patron.facade.ejaudiovisuales;




public class AudioPlayer implements I_AudioPlayer {

    @Override
    public void play() {
        System.out.println("Reproduciendo audio.");
    }

    @Override
    public void stop() {
        System.out.println("Parando audio.");
    }
    
}
