
package modelo;

public class Habitacion {
    //atributos
    private int noHabitacion;
    private double tarifa;
    private String foto;
    
    //métodos
    //método constructor

    public Habitacion(int noHabitacion, double tarifa, String foto) {
        this.noHabitacion = noHabitacion;
        this.tarifa = tarifa;
        this.foto = foto;
    }
    
    public void mostrarInformacion(){
        System.out.println("Número de habitacion: "+ noHabitacion);
        System.out.println("Precio por noche: "+ tarifa);
        System.out.println("Fotografia: "+ foto);

    
    }
    
}
