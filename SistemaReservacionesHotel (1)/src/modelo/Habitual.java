package modelo;

public class Habitual extends Cliente {
    private double descuento;

    public Habitual(String nombre, String direccion, String telefono, double descuento) {
        super(nombre, direccion, telefono);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Descuento: " + descuento + "%");
    }
}