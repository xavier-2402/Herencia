package ejercicio6herencia;
import java.util.Scanner;
public class Usuario {
    protected int cantidad_mensajes;
    protected String correo;
    protected String nick;
     private int cantidad_post;

    public Usuario(int cantidad_mensajes, String correo, String nick, int cantidad_post) {
        this.cantidad_mensajes = cantidad_mensajes;
        this.correo = correo;
        this.nick = nick;
        this.cantidad_post= cantidad_post;
        
    }

  
    public Usuario(){
        
    }
    Scanner reader = new Scanner (System.in);

    public int getCantidad_mensajes() {
        return cantidad_mensajes;
    }

    public void setCantidad_mensajes(int cantidad_mensajes) {
        this.cantidad_mensajes = cantidad_mensajes;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
      public int getCantidad_post() {
        return cantidad_post;
    }

    public void setCantidad_post(int cantidad_post) {
        this.cantidad_post = cantidad_post;
    }
    
    
    public int incrementa(){
        
        return cantidad_mensajes+1;
    }
    
     public int decrementa(){
        
        return cantidad_mensajes-1;
    }
     
     public int IncrementaPapelera(){
         return cantidad_post+1;
         
     }
     
     public void Modificar(){
         String correo_mod;
        System.out.println("Ingrese su correo ya modificado");
        correo_mod=reader.nextLine();
        correo=correo_mod;
         System.out.println("el correo modificado es: "+correo);
         
         
     }
    
    
    
}
