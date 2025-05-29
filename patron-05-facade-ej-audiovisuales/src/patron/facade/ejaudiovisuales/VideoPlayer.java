package patron.facade.ejaudiovisuales;




public class VideoPlayer implements I_VideoPlayer {

    @Override
    public void play() {
        System.out.println("Reproduciendo vídeo.");
    }

    @Override
    public void stop() {
        System.out.println("Parando vídeo.");
    }
    
}
