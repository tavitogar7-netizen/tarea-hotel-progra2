
package modelo;

public class Reservacion {
    //atributos
    private String fechaEntrada;
    private int cantidadDias;
    private Cliente cliente;
    private Habitacion habitacion;
    private int cantidadReservaciones=0;
    //metodos

    public Reservacion(String fechaEntrada, int cantidadDias, Cliente cliente, Habitacion habitacion) {
        this.fechaEntrada = fechaEntrada;
        this.cantidadDias = cantidadDias;
        this.cliente=cliente;
        this.habitacion=habitacion;
        cantidadReservaciones++;
        
    }   
    
    
    public void mostrarInformacion(){
        System.out.println("Fecha:"+ fechaEntrada);
        System.out.println("Días:"+cantidadDias);
     cliente.mostrarInformacion();
     habitacion.mostrarInformacion();
        
    }
    
    
    
    
}


