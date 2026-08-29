package modelo;

public class Esporadico extends Cliente {
    private String infoOfertas;

    public Esporadico(String nombre, String direccion, String telefono, String infoOfertas) {
        super(nombre, direccion, telefono);
        this.infoOfertas = infoOfertas;
    }

    public String getInfoOfertas() {
        return infoOfertas;
    }

    public void setInfoOfertas(String infoOfertas) {
        this.infoOfertas = infoOfertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Ofertas: " + infoOfertas);
    }
}