package ejercicio6herencia;
public class Ejercicio6Herencia {

    public static void main(String[] args) {
        
        Administradores ad = new Administradores(50,"car_bac.34@gmail.com","carlos Baculima",2,4);
        Moderadores mod = new Moderadores(38,"alejo.ber.2@gmail.com","Alejandro Bernal",17);
        System.out.println("Administradores");
        System.out.println(ad.incrementa());
        System.out.println(ad.IncrementarBaneos());
        System.out.println(ad.decrementa());
        System.out.println(ad.IncrementaPapelera());
        ad.Modificar();
        ad.ModificarNombreUsuario();
        System.out.println("Moderadores");
        System.out.println(mod.incrementa());
        System.out.println(mod.IncrementaPapelera());
        System.out.println(mod.decrementa());
        mod.Modificar();
        
        
    }
    
}
