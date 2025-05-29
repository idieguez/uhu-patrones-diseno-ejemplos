package patron.facade.ejlogin;




public class Facade_autentificacion implements I_Facade_autentificacion {
	
    private I_Validador validador=new Validador();
    private I_UsuarioBD db=new UsuarioBD();
    private I_Rol rol=new Rol();
    private I_Logger logger=new Logger();
    
    
    
    
    @Override
    public void login(String u, String c) {
    	
        logger.log("Intento login usuario "+u);
        
        if (!validador.validar(u, c))
            logger.log("Validacion fallida");
        
        if (!db.autentificacion(u, c)) {
            logger.log("Autentificacion fallida del usuario "+u);
            System.out.println("Intentalo de nuevo ");
        }
        
        String role = rol.getRol(u);
        logger.log("Usuario "+u+" logeado correctamente");
        
    }
    
}
