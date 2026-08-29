package modelo;

public class Hotel {
    private String nombre;
    private int estrellas;
    private Habitacion[] habitaciones;
    private int cantidadHabitaciones;

    public Hotel(String nombre, int estrellas) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.habitaciones = new Habitacion[20];
        this.cantidadHabitaciones = 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        if (cantidadHabitaciones < habitaciones.length) {
            habitaciones[cantidadHabitaciones] = habitacion;
            cantidadHabitaciones++;
        } else {
            System.out.println("No puede agregar mas habitaciones");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Hotel: " + nombre);
        System.out.println("Numero de estrellas: " + estrellas);
        System.out.println("Habitaciones registradas: " + cantidadHabitaciones);
        for (int i = 0; i < cantidadHabitaciones; i++) {
            System.out.println("--- Detalle Habitacion " + (i + 1) + " ---");
            habitaciones[i].mostrarInformacion();
        }
    }
}