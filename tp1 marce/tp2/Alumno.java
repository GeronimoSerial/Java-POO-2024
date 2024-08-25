public class Alumno {
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;

    public Alumno(int p_lu, String p_nombre, String p_apellido) {
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(0);
        this.setNota2(0);
    }

    private void setLu(int p_lu) {
        this.lu = p_lu;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public void setNota1(double p_nota1) {
        this.nota1 = p_nota1;
    }

    public void setNota2(double p_nota2) {
        this.nota2 = p_nota2;
    }

    public int getLu() {
        return this.lu;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double promedio() {
        return (getNota1() + getNota2()) / 2.0;
    }

    public boolean aprueba() {
        return promedio() > 7.0 && getNota1() >= 6 && getNota2() >= 6;
    }

    public String leyendaAprueba() {
        if(aprueba()) {
            return "Aprobado";
        }
        return "Desaprobado";
    }

    public String nomYape() {
        return getNombre() + " " + getApellido();
    }

    public String apeYnom() {
        return getApellido() + " " + getNombre();
    }

    public void mostrar() {
        System.out.println("Nombre y Apellido: " + nomYape());
        System.out.println("LU: " + getLu() + " " + "Notas: " + getNota1() + " - " + getNota2());
        System.out.println("Promedio: " + promedio() + " - " + leyendaAprueba());
    }
}
