
package modelo;

public class Hotel {
    //atributo
    private String nombre;
    private int estrellas;
    //relación
    private Habitacion[] habitaciones;
    private int cantidadHabitaciones;
    
    
    
    //Métodos
    //método constructor
    
    public Hotel(String nombre, int estrellas){
      this.nombre=nombre;
      this.estrellas=estrellas;
      
      this.habitaciones=new Habitacion[20];
      this.cantidadHabitaciones=0;
    
    }
    
    public void agregarHabitacion(Habitacion habitacion){
        if (cantidadHabitaciones<habitaciones.length) {
            habitaciones[cantidadHabitaciones]=habitacion;
            cantidadHabitaciones++;
            
        }else{
            System.out.println("No puede agregar más habitaciones");
            }
        
    
    }
    
    public void mostrarInformacion(){
    
        System.out.println("Hotel: "+nombre);
        System.out.println("Número de estrellas:"+estrellas );
        System.out.println("Habitaciones disponibles = " + cantidadHabitaciones );
    }
}
