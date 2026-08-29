
package modelo;

public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
     public void mostrarInformacion(){
        System.out.println("Cliente: "+ nombre);
        System.out.println("Direccion: "+ direccion);
        System.out.println("Telefono: "+ telefono);

    
    }
    
    
}
