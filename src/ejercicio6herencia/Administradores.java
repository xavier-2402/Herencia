package ejercicio6herencia;
public class Administradores extends Usuario  {
    protected int cantidad_baneos;

    public Administradores(int cantidad_mensajes, String correo, String nick,int cantidad_post, int cantidad_baneos) {
        super(cantidad_mensajes, correo, nick,cantidad_post);
        this.cantidad_baneos = cantidad_baneos;
    }

    public Administradores() {
       
    }

    public int getCantidad_baneos() {
        return cantidad_baneos;
    }

    public void setCantidad_baneos(int cantidad_baneos) {
        this.cantidad_baneos = cantidad_baneos;
    }
    
    
    public void ModificarNombreUsuario(){
        String nombre;
        System.out.println("Ingrese su nuevo nombre de usuario ya modificado");
        nombre = reader.nextLine();
        nick=nombre;
        System.out.println("El nombre de usuario modificado es: "+nick);
        
    }
    public int IncrementarBaneos(){
        
        return cantidad_baneos +1;
    }
    
    
    
}
