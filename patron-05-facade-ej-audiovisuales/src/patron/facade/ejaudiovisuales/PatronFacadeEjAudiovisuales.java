package patron.facade.ejaudiovisuales;




public class PatronFacadeEjAudiovisuales {
    
    public static void main(String[] args) {
        
        /*
        // SIN Facade:
        I_AudioPlayer ap1 = new AudioPlayer();
        I_VideoPlayer vp1 = new VideoPlayer();
        I_Lights l1 = new Lights();
        
        ap1.play();
        vp1.play();
        l1.on();
        
        ap1.stop();
        vp1.stop();
        l1.off();
        */
        
        // CON Facade:
        I_FacadeMultimedia facade = new FacadeMultimedia();
        facade.playMultimedia();
        facade.stopMultimedia();
        
    }
    
}
