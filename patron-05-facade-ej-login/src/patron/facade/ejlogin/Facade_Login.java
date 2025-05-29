package patron.facade.ejlogin;

import java.util.Scanner;




public class Facade_Login {
	
    public static void main(String[] args) {
    	
        String u, c;
        Scanner sc = new Scanner(System.in);
        I_Facade_autentificacion aut = new Facade_autentificacion();
        
        System.out.println("Introduzca el nombre de usuario: ");
        u = sc.nextLine();
        
        System.out.println("Introduzca la contraseña: ");
        c = sc.nextLine();
        
        aut.login(u, c);
        
    }
    
}
