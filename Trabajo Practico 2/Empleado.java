import java.util.*;

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
        this.setSueldo(p_importe);
        this.setAnio(p_anio);
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

    private void setSueldo(double p_importe){
        this.sueldoBasico = p_importe;
    }

    private void setAnio(int p_anio){
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
        int anioActual = fechaHoy.get(Calendar.YEAR);

        return anioActual - this.getAnioIngreso();
    }

    private double descuento(){
        return (this.getSueldoBasico() * 0.02) + 1500;
    }

    private double adicional(){
        double porcentaje;

       if (antiguedad() < 2) {
            porcentaje = 0.02;
       }
       else if (antiguedad() >= 2 && antiguedad() < 10) {
            porcentaje = 0.04;
       }
       else {
            porcentaje = 0.06;
       }

       return this.getSueldoBasico() * porcentaje;
    }

    public double sueldoNeto(){
        return this.getSueldoBasico() + adicional() - descuento();
    }

    public String nomYape() {
        return this.getNombre() + " " + this.getApellido();
    }
    public String apeYnom(){
        return this.getApellido() + " " + this.getNombre();
    }

    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYape());
        System.out.println("\nCUIL:" + this.getCuil() + " Antiguedad: " + this.antiguedad()  + " años de servicio");
        System.out.println("\nSueldo Neto: $ " + this.sueldoNeto());
    }

}