package patron.facade.ejlogin;




public class Validador implements I_Validador{
	
    @Override
    public boolean validar(String u, String c) {
		
        if (u==null||c==null||c.isEmpty()||u.isEmpty()) {
            System.out.println("Validacion incorrecta: Usuario");
            return false;
        } else {
            return true;
		}
		
    }
    
}
