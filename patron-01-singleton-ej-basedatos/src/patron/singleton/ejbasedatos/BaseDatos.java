package patron.singleton.ejbasedatos;




public final class BaseDatos {
    
    // Atributo (del patrón Singleton).
    private static final BaseDatos baseDatos = new BaseDatos();
    
    // Atributos (de la clase).
    private static String url;
    
    private static String host;
    private static int port;
    private static String database;
    
    private static String username;
    private static String password;
    
    
    
    
    // Constructor.
    private BaseDatos() {
        
        host = "database1.uhu.es";
        port = 3306;
        database = "asdm";
        
        username = "root";
        password = "root";
        
        url = "jdbc:mysql://" + username + ":" + password + "@" + host + ":" + port + "/" + database + "?serverTimezone=UTC";
        
    }
    
    
    
    
    // Métodos.
    public static BaseDatos getBaseDatos() {
        return baseDatos;
    }
    
    public void ejecutarSql(String sql) {
        System.out.println("Se ejecuta la siguiente SQL: " + sql);
    }
    
    public void mostrarDatosConexion() {
        System.out.println("La URL de conexión a la base de datos es: " + url);
    }
    
}
