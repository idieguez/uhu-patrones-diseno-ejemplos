package patron.facade.ejlogin;




public class Rol implements I_Rol {
	
    @Override
    public String getRol(String u) {
    	
        if (u.equals("admin"))
            return "Administrador";
        else
            return "Usuario estandar";
        
    }
    
}
