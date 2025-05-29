package patron.facade.ejlogin;




public class Logger implements I_Logger {
	
    @Override
    public void log(String mensaje) {
    	
        System.out.println("LOG "+mensaje);
        
    }
    
}
