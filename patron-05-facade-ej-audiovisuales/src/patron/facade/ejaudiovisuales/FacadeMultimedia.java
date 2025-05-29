package patron.facade.ejaudiovisuales;




public class FacadeMultimedia implements I_FacadeMultimedia {
    
    private I_AudioPlayer ap1;
    private I_VideoPlayer vp1;
    private I_Lights l1;

    public FacadeMultimedia() {
        ap1 = new AudioPlayer();
        vp1 = new VideoPlayer();
        l1 = new Lights();
    }
    
    @Override
    public void playMultimedia() {
        ap1.play();
        vp1.play();
        l1.on();
    }
    
    @Override
    public void stopMultimedia() {
        ap1.stop();
        vp1.stop();
        l1.off();
    }
    
}
