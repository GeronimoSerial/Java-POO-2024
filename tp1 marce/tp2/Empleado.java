import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }

    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }

    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }

    private void setAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }

    public long getCuil(){
        return this.cuil;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getSueldoBasico(){
        return this.sueldoBasico;
    }

    public int getAnioIngreso(){
        return this.anioIngreso;
    }

    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.anioIngreso;
    }

    private double descuento(){
        return (this.getSueldoBasico() - (0.02 * this.getSueldoBasico())) + 1500;
    }


    private double adicional(){
        if(antiguedad() < 2){
            return this.getSueldoBasico() + (this.getSueldoBasico() / 100) * 2.0;
        }
        else if(antiguedad() >= 2 && antiguedad() < 10){
            return this.getSueldoBasico() + (this.getSueldoBasico() / 100) * 4.0;
        }
        else if(antiguedad() >= 10){
            return this.getSueldoBasico() + (this.getSueldoBasico() / 100) * 6.0;
        }
        return this.getSueldoBasico();
    }

    public String nomYape(){
        return getNombre() + " " + getApellido();
    }

    public String apeYnom(){
        return getApellido() + " " + getNombre();
    }

    public double sueldoNeto(){
        return this.getSueldoBasico() + adicional() - descuento();
    }

    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYape());
        System.out.println("CUIL: " + getCuil() + " " + "Antiguedad: " + antiguedad() + " " + "años de servicio");
        System.out.println("Sueldo Neto: $" + sueldoNeto());
    }


    public String mostrarLinea(){
        return getCuil() + " " + getApellido() + " " + getNombre() + "............" + "$ " +  sueldoNeto();
    }
}