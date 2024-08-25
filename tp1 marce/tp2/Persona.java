import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;

    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio) {
        this.setNroDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }

    private void setNroDni(int p_dni) {
        this.nroDni = p_dni;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    private void setAnioNacimiento(int p_anio) {
        this.anioNacimiento = p_anio;
    }

    public int getNroDni() {
        return this.nroDni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getAnioNacimiento() {
        return this.anioNacimiento;
    }

    public String nomYApe() {
        return getNombre() + " " + getApellido();
    }

    public String apeYNom() {
        return getApellido() + getNombre();
    }

    public int edad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioNacimiento();
    }

    public void mostrar() {
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("DNI: " + getNroDni() + " " + "Edad: " + edad() + " " + "años");
    }
}
