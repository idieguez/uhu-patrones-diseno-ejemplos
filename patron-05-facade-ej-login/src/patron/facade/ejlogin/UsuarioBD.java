package patron.facade.ejlogin;

import java.util.Map;




public class UsuarioBD implements I_UsuarioBD {
	
    private Map<String,String> usuarios=Map.of("admin", "admin123", "user", "user123");
    
    
    
    
    @Override
    public boolean autentificacion(String u, String c) {
    	
        return usuarios.containsKey(u)&&usuarios.get(u).equals(c);
        
    }
    
}
