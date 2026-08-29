
package app;
import modelo.*;

public class Principal {

    public static void main(String[] args) {
        
        Hotel hotel1=new Hotel("Hotel Mirador Colonial",4);
        Habitacion habitacion1=new Habitacion(301,300,"habitacion301.jpg");
        Habitacion habitacion2=new Habitacion(302,350,"habitacion302.jpg");
        hotel1.agregarHabitacion(habitacion1);
        hotel1.agregarHabitacion(habitacion2);
        
        //cliente
        Cliente cliente1=new Cliente("Carlos Merida","San Marcos","556859587");
        
        //crear reservacion
        Reservacion reservacion1=new Reservacion("08/08/2026",2,cliente1,habitacion1);
        
        
        
        System.out.println("INFORMACION DE HOTEL");
        System.out.println("---------------------");
        hotel1.mostrarInformacion();
        reservacion1.mostrarInformacion();
        
        
        
      
    }
    
}
