package patron.singleton.ejbasedatos;




public class PatronSingletonEjBaseDatos {

    public static void main(String[] args) {
        
        BaseDatos bd1 = BaseDatos.getBaseDatos();
        BaseDatos bd2 = BaseDatos.getBaseDatos();
        
        System.out.println("---------- bd1 ----------");
        bd1.mostrarDatosConexion();
        bd1.ejecutarSql("SELECT * FROM Usuarios");
        
        System.out.println("");
        
        System.out.println("---------- bd2 ----------");
        bd2.mostrarDatosConexion();
        bd2.ejecutarSql("INSERT INTO Usuarios VALUES ('Pablo', 'Ruiz Picasso', 'alumno')");
        
        System.out.println("");
        
        System.out.println("------- bd1 vs bd2 ------");
        System.out.println("Comprobar si ambos objetos BaseDatos ('bd1', 'bd2') son iguales: " + (bd1 == bd2));
        
    }
    
}
